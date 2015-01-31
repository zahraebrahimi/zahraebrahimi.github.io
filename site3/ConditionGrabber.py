#!/usr/bin/env python
# -*- coding: utf-8 -*-
from bs4 import BeautifulSoup
import urllib2

opener = urllib2.build_opener(urllib2.HTTPRedirectHandler(), urllib2.HTTPCookieProcessor())

cnt =0
for k in range(1,18) :
    soup = BeautifulSoup(opener.open("http://www.symcat.com/conditions?q=&page="+str(k)).read())
    all =soup.find_all("dt")
    for i in all :
        cnt +=1
        # print(""+str(cnt)+" : "+str(i.d))
        print("Condition : "+ i.a.string)
        print("Link : " + i.a['href'])
        soup2 = BeautifulSoup(opener.open("http://www.symcat.com"+i.a['href']).read())
        desc = soup2.find('div',{'class':'well'})
        Text =u""
        for child in desc.children:
          if child.name == 'p' :
            # print child.string
            Text = Text + u"\n"+child.string.strip()
            # u' '.join((Text, child.string.strip())).encode('utf-8')
        # print (desc.contents[3].string)
        print (Text)

        symptoms = soup2.find_all('li',{'class':'symptom-li'})
        print ("Len : "+ str(len(symptoms)))
        for s in   symptoms :
            print "Symptom : " + s.span.span.string + " Link : " + s.span.a['href'].replace("..","")







