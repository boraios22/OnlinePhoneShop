package com.itstep.onlinephoneshop.repo;

import java.util.Hashtable;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.itstep.onlinephoneshop.entity.Users;

@Repository
@Transactional
public class UserRepo extends BaseGenericRepo<Users> implements IGenericRepo<Users> {

	@Override
	public void save(Users entity) {
		super.saveEntity(entity);
	}

	@Override
	public void update(Users entity) {
		super.updateEntity(entity);
	}

	@Override
	public Users findById(int id) {
		return super.findEntityById(Users.class, id);
	}

	@Override
	public void delete(int id) {
		super.deleteEntity(Users.class, id);
	}

	@Override
	public List<Users> findAll() {
		return super.findAllEntity(Users.class, "from Users");
	}

	@Override
	public List<Users> findAllByEmail(String email) {
		Hashtable<String, String> params = new Hashtable<>();
		params.put("email", email);
		
		
		return super.findAllEntityWithParams("select u from Users u where u.email = :email", params);
	}

}
