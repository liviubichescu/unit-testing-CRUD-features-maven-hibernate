//package com.test;
//
//import java.util.List;
//
//import org.hibernate.Query;
//import org.hibernate.Session;
//
//import com.test.entities.Persoana;
//
//public class UserService {
//
//	public void add(Persoana p) {
//		Session sessionObj = HibernateConfig.buildSessionFactory().openSession();
//		try {
//			sessionObj.beginTransaction();
//			sessionObj.save(p);
//			System.out.println("\n.......Records Saved Successfully To The Database.......\n");
//
//			// Committing The Transactions To The Database
//			sessionObj.getTransaction().commit();
//		} catch (Exception sqlException) {
//			if (null != sessionObj.getTransaction()) {
//				System.out.println("\n.......Transaction Is Being Rolled Back.......");
//				sessionObj.getTransaction().rollback();
//			}
//			sqlException.printStackTrace();
//		} finally {
//			if (sessionObj != null) {
//				sessionObj.close();
//			}
//		}
//	}
//
//	public void getAll(int age, String nume) {
//		Session sessionObj = HibernateConfig.buildSessionFactory().openSession();
//		try {
//			sessionObj.beginTransaction();
//			Query<Persoana> query = sessionObj.createQuery("from Persoana where age = ? and nume = ?");
//			query.setInteger(0, 33);
//			query.setString(1, nume);
//			List<Persoana> result = query.getResultList();
//			System.out.println(result.size());
//			System.out.println("\n.......Records Saved Successfully To The Database.......\n");
//
//			// Committing The Transactions To The Database
//			sessionObj.getTransaction().commit();
//		} catch (Exception sqlException) {
//			if (null != sessionObj.getTransaction()) {
//				System.out.println("\n.......Transaction Is Being Rolled Back.......");
//				sessionObj.getTransaction().rollback();
//			}
//			sqlException.printStackTrace();
//		} finally {
//			if (sessionObj != null) {
//				sessionObj.close();
//			}
//		}
//	}
//
//	public void delete() {
//
//		Session sessionObj = HibernateConfig.buildSessionFactory().openSession();
//		try {
//			sessionObj.beginTransaction();
//			Persoana p = sessionObj.find(Persoana.class, "55");
//			p.setName("tralalala");
//			sessionObj.remove(p);
//			System.out.println("\n.......Records Deleted Successfully from The Database.......\n");
//
//			// Committing The Transactions To The Database
//			sessionObj.getTransaction().commit();
//		} catch (Exception sqlException) {
//			if (null != sessionObj.getTransaction()) {
//				System.out.println("\n.......Transaction Is Being Rolled Back.......");
//				sessionObj.getTransaction().rollback();
//			}
//			sqlException.printStackTrace();
//		} finally {
//			if (sessionObj != null) {
//				sessionObj.close();
//			}
//		}
//	}
//
//	public void update(int age, String cnp) {
//		Session sessionObj = HibernateConfig.buildSessionFactory().openSession();
//		try {
//			sessionObj.beginTransaction();
//			Persoana p = (Persoana) sessionObj.get(Persoana.class, cnp);
//			p.setAge(age);
//
//			sessionObj.save(p);
//			System.out.println("\n.......Records Updated Successfully To The Database.......\n");
//
//			// Committing The Transactions To The Database
//			sessionObj.getTransaction().commit();
//		} catch (Exception sqlException) {
//			if (null != sessionObj.getTransaction()) {
//				System.out.println("\n.......Transaction Is Being Rolled Back.......");
//				sessionObj.getTransaction().rollback();
//			}
//			sqlException.printStackTrace();
//		} finally {
//			if (sessionObj != null) {
//				sessionObj.close();
//			}
//		}
//	}
//}
