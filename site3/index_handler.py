__author__ = 'ghasedak'

import tornado
from models import post

class IndexHandler(tornado.web.RequestHandler):
    def get(self):
        newpost=post.select()
        self.render('index2.html',post=newpost)