package log4jdemoOne;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Client1{
	static Logger l = Logger.getLogger(Client1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout l1 = new SimpleLayout(); 
		Appender a; 
		  try 

		  { 

		  a = new FileAppender(l1,"mylog1.txt", false); 

		  l.addAppender(a); 

		  } 

		  catch(Exception e) {}	   
		
		l.debug("This is debug message");
		l.info("This is info message");

		l.warn("This is warn message");

		l.fatal("This is fatal message");

		l.error("This is error message");

		System.out.println("Your logic executed successfully....");
	}

}