package log4jdemoOne;


import org.apache.log4j.Appender;

import org.apache.log4j.FileAppender;

import org.apache.log4j.Layout;

import org.apache.log4j.Logger;

import org.apache.log4j.SimpleLayout;

public class Client2 {

static Logger l = Logger.getLogger(Client2.class.getName());

public static void main(String[] args) {

Layout l1 = new SimpleLayout();

Appender a;

try

{

a = new FileAppender(l1,"mylog.txt", false);

l.addAppender(a);

}

catch(Exception e) {}

l.fatal("This is the error message..");

System.out.println("Your logic executed successfully....");

}

}