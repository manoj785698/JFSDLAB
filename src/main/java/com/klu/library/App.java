package com.klu.library;

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

		Book book = new Book();
		book.setItemId(3);
		book.setTitle("Java");
		book.setAuthor("J.Bloch");
		book.setIsbn(978_013_4685_991L);

		session.save(book);

		DVD dvd = new DVD();
		dvd.setItemId(4);
		dvd.setDirector("PFSD");
		dvd.setRegionCode("1234");
		dvd.setDirector("Joseph");

		session.save(dvd);

		t.commit();
		session.close();
		sf.close();
	}
}
