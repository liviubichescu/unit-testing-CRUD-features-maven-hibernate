
package com.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Liviu
 *
 */
public class HibernateConfig {

	public static SessionFactory buildSessionFactory() {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		return sessionFactory;
	}

}
