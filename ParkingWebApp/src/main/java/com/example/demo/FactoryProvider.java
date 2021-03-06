package com.example.demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {

		public static SessionFactory factory;
		
		public static SessionFactory getFactory()
		{
			if(factory==null)
				factory=(SessionFactory) new Configuration().configure("hibernate.cfg.xml");
			return factory;
		}
		
		public void closeFactory() {
			if(factory.isOpen())
				factory.close();
		}
			
}
