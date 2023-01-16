package com.itstep.onlinephoneshop.dao;

import java.util.List;

public interface GenericDAO<T> {
	public void create(T entity);
	public void update(T entity);
	public T get(int id);
	public List<T> listAll();
	public long count();
}
