package com.itstep.onlinephoneshop.repo;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class BaseGenericRepo <T> {
	@PersistenceContext
	EntityManager manager;
	
	protected void saveEntity(T entity) {
		manager.persist(entity);
	}
	
	protected void updateEntity(T entity) {
		manager.merge(entity);
	}
	
	protected T findEntityById(Class<T> type, int id) {
		return manager.find(type, id);
	}
	
	protected void deleteEntity(Class<T> type, int id) {
		var ref = manager.getReference(type, id);
		manager.remove(ref);
	}
	
	protected List<T> findAllEntity(Class<T> type, String query) {
		return manager.createQuery(query, type).getResultList();
	}
	
	protected List<T> findAllEntityWithParams(String q, Hashtable<String, String> params) {
		Query query = manager.createQuery(q);
		for (Map.Entry<String, String> entry : params.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			query.setParameter(key, val);
		}
		return query.getResultList();
	}
}
