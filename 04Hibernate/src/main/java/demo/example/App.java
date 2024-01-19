package demo.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import demo.example.entity.CustomerInfo;

public class App {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
								.configure("Hibernate.cfg.xml")
								.addAnnotatedClass(CustomerInfo.class)
								.buildSessionFactory();
		Session session=factory.getCurrentSession();
		try {
			//create object of entity class
			CustomerInfo customer=new CustomerInfo();
			//CustomerInfo customer=new CustomerInfo("Vicky","V@gmail");
			//to start
			session.beginTransaction();
			
			// operational statement 
			//insert into table
			//session.save(customer);
			//session.getTransaction().commit();	//commit transaction
			//System.out.println("Added.!");
			
			//read from table
//		session.get(CustomerInfo.class, 2);
//			session.getTransaction().commit();	
//			System.out.println(customer);
//			System.out.println("Displayed.!");
			
			//update
//			customer=session.get(CustomerInfo.class,1);
//			customer.setName("Akanksha");
//			session.getTransaction().commit();	
//			System.out.println("updated.!");
			
			//delete
			customer=session.get(CustomerInfo.class,1);
			session.delete(customer);
			session.getTransaction().commit();	
			System.out.println("deleted.!");
	}finally {
		session.close();
		factory.close();
		}

}}
