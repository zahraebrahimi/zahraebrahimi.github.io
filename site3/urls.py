__author__ = 'ghasedak'

from  index_handler import IndexHandler
from post_handlers import  NewPostHandler,showhandler,edit_handler,delete_handler
urllist= [
    (r'/',IndexHandler),
    (r'/new$',NewPostHandler),
    (r'/show$',showhandler),
    (r'/edit/(\d+)$',edit_handler),
    ( r'/delete/(\d+)$',delete_handler)


]