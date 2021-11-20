package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {


	public static void main(String[] args) {
		try{
			ApplicationContext c= 
					new ClassPathXmlApplicationContext("spring.xml");
			IplPlayersDetails cri=(IplPlayersDetails)c.getBean("ipl");
			cri.display();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
}
/*OUTPUT :
7	Dhoni	India	CSK
18	Virat	India	RCB
45	Rohit	India	MI
*/