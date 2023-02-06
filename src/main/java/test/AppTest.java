package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.itstep.onlinephoneshop.dao.UserDAO;
import com.itstep.onlinephoneshop.entity.Users;

public class AppTest {

	public static void main(String[] args) {
		
		//create config
		//config => creaet session factory
		//=> open session
		
		//Configuration config = new Configuration().configure("hibernate.cfg.xml");
		//SessionFactory sessionFactory = config.buildSessionFactory();
		
		//build session factory from config file
//		SessionFactory sessionFactory = new Configuration()
//				.addAnnotatedClass(Users.class)d
//				.configure("hibernate.cfg.xml").buildSessionFactory();
		
		//open session from session factory
//		Session session = sessionFactory.openSession();
		
		
//		session.beginTransaction();
		
		
		
		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("PhoneWebsite");
//		EntityManager manager = factory.createEntityManager();
//		
//		manager.getTransaction().begin();
//		
//		Users user = new Users("gfh@gmail.com","123","Dara");
//		manager.persist(user);
//		
//		manager.getTransaction().commit();
		
		
//		session.persist(user);
		
//		session.getTransaction().commit();
		
		// TODO Auto-generated method stub
		
		
		var lists = new UserDAO().listAll();
		for (Users users : lists) {
			System.out.println(users.getFullName());
		}
		
		
		System.out.println("Hello world");
		
		
	}

}
