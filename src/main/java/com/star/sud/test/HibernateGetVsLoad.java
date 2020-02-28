/**
 * 
 */
package com.star.sud.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.star.sud.model.Employee;
import com.star.sud.util.HibernateConfigUtil;

/**
 * @author Sudarshan
 *
 */
public class HibernateGetVsLoad {

	public static void main(String[] args) {

		// Initialization
		SessionFactory sessionFactory = HibernateConfigUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		try {

			// By Considering the data present in Database

			// Get Function
			Employee employee = (Employee) session.get(Employee.class, 1L);
			System.out.println("Employee Get Method Called");
			System.out.println("Employee Id= " + employee.getId());
			System.out.println("Employee Get Details: " + employee.getName());

			// Load Function
			Employee employee1 = (Employee) session.load(Employee.class, 2L);
			System.out.println("Employee Load Method Called");
			System.out.println("Employee Id= " + employee1.getId());
			System.out.println("Employee Load Details: " + employee1.getName());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close Resources
			tx.commit();
			sessionFactory.close();
		}

	}

}
