package com.klu.store;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();

		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		Electronics electronics = new Electronics();
		electronics.setProductId(001);
		electronics.setName("TV");
		electronics.setWarranty("1yr");
		electronics.setBrand("Sony");
		session.save(electronics);

		Clothing clothing = new Clothing();
		clothing.setProductId(002);
		clothing.setName("Shirt");
		clothing.setSize("S");
		clothing.setMaterial("Cotton");
		session.save(clothing);

		t.commit();
		session.close();
		sf.close();
	}
}
