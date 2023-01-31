package com.itstep.onlinephoneshop.dao;
import java.util.List;

public class BaseDAO<E> {
	
	
	protected int deleteEntity(int id) {return 0;}
	
	protected int updateEntity(E entity) {return 0;}
	
	protected int createEntity (E entity) {return 0;}
	
	protected E findEntity (int id) {return null;}
	
	protected List<E> listAllEntities(){return null;}
}
