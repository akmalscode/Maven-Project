package com.my.product.dao;


import java.util.Map;
import java.util.HashMap;

import com.my.product.dto.Product;

public class ProductDAOImp implements ProductDAO {
	
	
	Map<Integer,Product> products=new HashMap<>();
	

	@Override
	public void create(Product pro) {
		products.put(pro.getId(), pro);

	}

	@Override
	public Product read(int id) {
		
		return products.get(id);
	}

	@Override
	public void update(Product proDetails) {

	}

	@Override
	public void delete(int id) {

	}

}
