package com.iiht.restjpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.restjpa.entity.Product;
import com.iiht.restjpa.services.ProductService;

@RestController
@RequestMapping("/product/api.1.0")
public class ProductController {
//Get ..if client wants to take some information from our server or application
//
	
	
	@Autowired
	ProductService service;
	
	//No semi colon for above 
	@PostMapping(path="/create",
	consumes=MediaType.APPLICATION_JSON_VALUE,
	produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> createProduct(@RequestBody Product productReq){
		
		Product newProduct = service.save(productReq);
		return new ResponseEntity<Product>(newProduct,HttpStatus.CREATED);
	}
	
	//Wherever getmapping is used ..Donot forget to use "get" option in postmman
	@GetMapping("/fetch/{id}")
	public ResponseEntity<Product> fetch(@PathVariable long id){
		
		return ResponseEntity.ok(service.fetch(id));
	}
	
	@GetMapping("/fetch/all")
	public ResponseEntity<List<Product>> fetchAllProducts(){
		return ResponseEntity.status(HttpStatus.OK).body(service.fetchAll());
	}
	
	/*
	 * @PutMapping("/update/{id}/{desc}/{price}") public ResponseEntity<Product>
	 * update(@PathVariable long id,@PathVariable String desc,@PathVariable double
	 * price) { return ResponseEntity.status(HttpStatus.OK).body(service.update(id,
	 * desc, price)); }
	 * 
	 * Or use the below ones 
	 */
	//Donot forget to use "PUT" option in postmann 
	/*
	 * @PutMapping("/update/{id}") public ResponseEntity<Product>
	 * updateProduct(@PathVariable long id,@RequestBody Product productReq){
	 * 
	 * Product newProduct = service.update(id,productReq); return new
	 * ResponseEntity<Product>(newProduct,HttpStatus.CREATED); }
	 */
	
	//Donot forget to use "DELETE" option in postmann
	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable long id){
		service.delete(id);
	}
	
	@DeleteMapping("/delete/all")
	public void deleteAll() {
		service.deleteAll();
	}
}
