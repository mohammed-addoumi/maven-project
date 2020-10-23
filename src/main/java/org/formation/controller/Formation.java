package org.formation.controller;

import org.formation.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Formation {
	
	public static void main(String[] args) {
		
	User user = new User("simo",10);
    
	Configuration cnf = new Configuration().configure().addAnnotatedClass(User.class);
	SessionFactory factory = cnf.buildSessionFactory();
	Session session = factory.openSession();
	
	Transaction tx = session.beginTransaction();
	session.save(user);
	tx.commit();
	}

}
