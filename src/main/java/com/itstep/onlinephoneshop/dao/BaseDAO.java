package com.itstep.onlinephoneshop.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class BaseDAO<E> {
	
	protected EntityManagerFactory factory;
	
	public BaseDAO() {
		factory = Persistence.createEntityManagerFactory("PhoneWebsite");
	}

	protected void createEntity (E entity) 
	{
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
	}
	
	protected void deleteEntity(Class<E> type, int id) 
	{
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		E reference = manager.find(type, id);
		manager.remove(reference);
		manager.getTransaction().commit();
	}
	
	protected void updateEntity(E entity) 
	{
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
	}
	
	protected E findEntity (Class<E> type, int id) 
	{
		EntityManager manager = factory.createEntityManager();
		E reference = manager.find(type, id);
		return reference;
	}
	
	protected List<E> listAllEntities(String query)
	{
		EntityManager manager = factory.createEntityManager();
		List<E> list = manager.createQuery(query).getResultList();
		
		return list;
	}
}
