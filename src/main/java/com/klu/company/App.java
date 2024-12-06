package com.klu.company;

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

		Car car = new Car();
		car.setVehicleId(211);
		car.setModel("Amaze");
		car.setSeats(5);
		car.setFuelType("Petrol");
		session.save(car);

		Bike bike = new Bike();
		bike.setVehicleId(311);
		bike.setModel("Enfield");
		bike.setType("Bike");
		bike.setEngineCapacity(1000);
		session.save(bike);

		t.commit();
		session.close();
		sf.close();
	}
}
