package edu.htn.services;

import java.util.List;

import edu.htn.pojo.User;

public interface UserService {

	public void insertData(User user);

	public List<User> getUserList();

	public void deleteData(String id);

	public User getUser(String id);

	public void updateData(User user);

}