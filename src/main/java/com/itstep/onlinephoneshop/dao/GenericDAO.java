package com.itstep.onlinephoneshop.dao;

import java.util.List;

public interface GenericDAO<E> {
	public void create(E entity);
	public void update(E entity);
	public E get(int id);
	public E get(String email);
	public List<E> listAll();
	public long count();
}
