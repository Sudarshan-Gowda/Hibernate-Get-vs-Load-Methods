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
public class HibernateGetVsLoadSecond {

	public static void main(String[] args) {

		// Initialization
		SessionFactory sessionFactory = HibernateConfigUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		// By Considering No Data in the Database

		// Get Function
		try {
			Employee employee = (Employee) session.get(Employee.class, 1L);
			System.out.println("Employee Get Method Called");
			if (employee != null) {
				System.out.println("Employee Id= " + employee.getId());
				System.out.println("Employee Get Details: " + employee.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Load Function
		try {
			Employee employee1 = (Employee) session.load(Employee.class, 2L);
			System.out.println("Employee Load Method Called");
			if (employee1 != null) {
				System.out.println("Employee Id= " + employee1.getId());
				System.out.println("Employee Load Details: " + employee1.getName());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Close Resources
		tx.commit();
		sessionFactory.close();

	}

}
