package demo.example;

import java.util.List;

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
			session.beginTransaction();
			
			List<CustomerInfo> customer= session.createQuery("from Info where name='Kushi' OR " + " mail like 'V@gmail'").getResultList();
			//session.createQuery("update Info set id='1' where name='vicky'").executeUpdate();
			
//			for (CustomerInfo temp:customer) {
//				System.out.println(temp);
//			}
//			
	}finally {
		session.close();
		factory.close();
		}

}}
