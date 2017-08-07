package com.diablo.Application;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.diablo.entity.HelloWorld;

public class MyApp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml"); 
		 
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session session = factory.openSession();
		 int id = 1;
		 HelloWorld s = (HelloWorld)session.get(HelloWorld.class,id);
		 System.out.print(s.getMsg());

	}

}
