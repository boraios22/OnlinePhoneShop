package com.itstep.onlinephoneshop.repo;

import java.util.List;

public interface IGenericRepo <T> {
	void save(T entity);
	void update(T entity);
	T findById(int id);
	void delete(int id);
	List<T> findAll();
	List<T> findAllByEmail(String email);
}
