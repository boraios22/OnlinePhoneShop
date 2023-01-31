package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.itstep.onlinephoneshop.entity.Users;

public class AppTest {

	public static void main(String[] args) {
		
		//create config
		//config => creaet session factory
		//=> open session
		
		//Configuration config = new Configuration().configure("hibernate.cfg.xml");
		//SessionFactory sessionFactory = config.buildSessionFactory();
		
		//build session factory from config file
		SessionFactory sessionFactory = new Configuration()
				.addAnnotatedClass(Users.class)
				.configure("hibernate.cfg.xml").buildSessionFactory();
		
		//open session from session factory
		Session session = sessionFactory.openSession();
		
		
		session.beginTransaction();
		
		Users user = new Users("abc@gmail.com","123","Kanha");
		
		session.persist(user);
		
		session.getTransaction().commit();
		
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		
	}

}
