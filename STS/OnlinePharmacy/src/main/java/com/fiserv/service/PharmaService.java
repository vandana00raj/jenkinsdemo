package com.fiserv.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiserv.dao.DaoClass;
import com.fiserv.entity.Product;
import com.fiserv.entity.Users;

@Transactional
@Service
public class PharmaService {

	@Autowired
	DaoClass dao;

	public String AddProduct(Product pro) {
		return dao.AddProduct(pro);
	}
	public Product getProductById(int id) {
		return dao.getProductById(id);
	}
	public List<Product> getAllProducts(){
		return dao.getAllProducts();
	}
	public String deleteById(int id) {
		return dao.deleteById(id);
	}
	public String UpdateProduct(Product pro) {
		return dao.UpdateProduct(pro);
	}
	public String AddUser(Users user) {
		return dao.AddUser(user);
	}
	public Users getUserByUserName(String username) {
		return dao.getUserByUserName(username);
	}
	public List<Users> getAllUsers(){
		return dao.getAllUsers();
	}
	public String deleteByUserName(String username) {
		return dao.deleteByUserName(username);
	}
	public String UpdateUser(Users user) {
		return dao.UpdateUser(user);
	}
}