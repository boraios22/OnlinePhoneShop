package com.itstep.onlinephoneshop.dao;

import java.util.List;
import com.itstep.onlinephoneshop.entity.Users;

public class UserDAO extends BaseDAO<Users> implements GenericDAO<Users> {

	@Override
	public void create(Users entity) {
		this.createEntity(entity);
	}

	@Override
	public void update(Users entity) {
		this.update(entity);
	}

	@Override
	public Users get(int id) {
		return this.findEntity(Users.class, id);
	}

	@Override
	public List<Users> listAll() {
		return this.listAllEntities("from Users");
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
}
