package com.fiserv.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiserv.entity.Product;
import com.fiserv.service.PharmaService;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController 
{
@Autowired
PharmaService serviceobj;

//Create Employee
@PostMapping("/addproduct")//http://localhost:8586/employees/EmployeeCreation
 public ResponseEntity<String> AddProduct(@RequestBody Product pro)
 {
	String message= serviceobj.AddProduct(pro);
	return new ResponseEntity<String>(message,new HttpHeaders(),HttpStatus.OK);
 }

//Get Particular Employee Data
@GetMapping("/GetProduct/{id}")//http://localhost:8586/employees/GetEmployee/123
private ResponseEntity<Product> getEmployee(@PathVariable("id") int id) 
{
Product p= serviceobj.getProductById(id);
return new ResponseEntity<Product>(p,new HttpHeaders(),HttpStatus.OK);

}

//Get All Employees Data
@GetMapping("/GetAllProducts")//http://localhost:8586/employees/GetAllEmployees
private ResponseEntity<List<Product>> getAllProducts() 
{
	List<Product> prolist= serviceobj.getAllProducts();
return new ResponseEntity<List<Product>>(prolist,new HttpHeaders(),HttpStatus.OK);

}

//Updating Employee data
@PutMapping("/UpdateProduct")

public ResponseEntity<String> UpdateEmployee(@RequestBody Product pro)//123
{
	String message= serviceobj.UpdateProduct(pro);
	return new ResponseEntity<String>(message,new HttpHeaders(),HttpStatus.OK);
}

//Deleting Employee
@DeleteMapping("/DeleteProduct/{id}")
private ResponseEntity<String> delEmp(@PathVariable("id") int id) 
{
	String message= serviceobj.deleteById(id);
	return new ResponseEntity<String>(message,new HttpHeaders(),HttpStatus.OK);
}

}
