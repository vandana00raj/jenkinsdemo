package com.fiserv.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.fiserv.entity.Product;
import com.fiserv.entity.Users;

@Repository
public class DaoClass implements DaoInterface {

	@PersistenceContext
	EntityManager em;

	@Override
	public String deleteById(int id) {
		Product p = em.find(Product.class, id);
		if (p == null)
			return "Provided Product id was not found";
		else {
			em.remove(p);
			return "Product Deleted Successfully!";
		}
	}

	@Override
	public List<Product> getAllProducts() {
		Query q = em.createQuery("select p from Product p");
		List<Product> prolist = q.getResultList();
		return prolist;
	}

	@Override
	public Product getProductById(int id) {
		return em.find(Product.class, id);
	}

	@Override
	public String AddProduct(Product pro) {
		Product p = em.merge(pro);
		if (p == null)
			return "Product not created";
		else
			return "Product created successfully";
	}

	@Override
	public String UpdateProduct(Product pro) {
		Product p = em.find(Product.class, pro.getProductId());
		if (p == null)
			return "Provided Product id was not found";
		else {
			p.setProductName(pro.getProductName());
			p.setProductImage(pro.getProductImage());
			p.setProductPrice(pro.getProductPrice());
			p.setProductRating(pro.getProductRating());
			p.setNoOfViews(pro.getNoOfViews());
			p.setProductCompany(pro.getProductCompany());
			p.setNoOfProducts(pro.getNoOfProducts());
			p.setProductInfo(pro.getProductInfo());
			p.setDiscount(pro.getDiscount());
			return "Updated Product Info Successfully!";
		}

	}

	@Override
	public String deleteByUserName(String username) {
		Users u = em.find(Users.class, username);
		if (u == null)
			return "Provided username was not found";
		else {
			em.remove(u);
			return "user Deleted Successfully!";
		}
	}

	@Override
	public List<Users> getAllUsers() {
		Query l = em.createQuery("select u from Users u");
		List<Users> userlist = l.getResultList();
		return userlist;
	}

	@Override
	public Users getUserByUserName(String username) {
		return em.find(Users.class, username);
	}

	@Override
	public String AddUser(Users user) {
		Users u = em.merge(user);
		if (u == null)
			return "User not created";
		else
			return "User created Successfully";
	}

	@Override
	public String UpdateUser(Users user) {
		Users u = em.find(Users.class, user.getUsername());
		if (u == null)
			return "Provided username was not found";
		else {
			u.setPassword(user.getPassword());
			u.setPhonenumber(user.getPhonenumber());
			u.setEmailid(user.getEmailid());
			return "Updated User_Info Successfully!";
		}
	}
}
