__author__ = 'ghasedak'

import peewee

myDB = peewee.MySQLDatabase("new", host="localhost", port=3306, user="root", passwd="")

class MYSQLModel (peewee.Model):
    class Meta:
         database = myDB

class post(MYSQLModel):
    id = peewee.PrimaryKeyField()
    title = peewee.CharField()
    author = peewee.CharField()
    date = peewee.CharField()
    text = peewee.CharField()
    img = peewee.CharField()


myDB.connect()

if __name__ == '__main__':

  myDB.create_tables([post])

