__author__ = 'ghasedak'


import  tornado
from  models import post
class NewPostHandler(tornado.web.RequestHandler):
    def get(self):
        self.render('add_post.html')

    def post(self):
        tit = self.get_argument("h_post")
        date = self.get_argument("d_post")
        te=self.get_argument("t_post")
        author = self.get_argument("a_post")
        img = self.get_argument("img")

        img2="../static/img/%s" %(img)
        info =post.create( title=tit,author=author,date=date,text=te,img=img2)
        self.redirect('/')


class showhandler(tornado.web.RequestHandler):
     def get(self):
         post1=post.select()
         self.render('show_post.html',post=post1)

class edit_handler( tornado.web.RequestHandler):
     def get(self , *args):
         catid = args[0]
         post2 = post.select().where(post.id == catid).get()
         self.render('edit_post.html', po=post2)


     def post(self,*args):

       catid= args[0]
       catinfo= post.select().where(post.id == catid).get()

       catinfo.title=self.get_argument("h-post")
       catinfo.date=self.get_argument("d-post")
       catinfo.author=self.get_argument("a-post")
       catinfo.text=self.get_argument("t-post")
       catinfo.save()
       self.redirect('/')

class delete_handler(tornado.web.RequestHandler):

    def get(self,*args):
       catid=args[0]
       catinfo = post.select().where(post.id == catid).get().delete_instance()
       self.redirect('/')
