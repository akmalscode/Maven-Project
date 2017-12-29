package com.my.product.dao;

import com.my.product.dto.Product;

public interface ProductDAO {
	
	void create (Product pro);
	
	Product read(int id);
	
	void update(Product proDetails);
	
	void delete(int id);

}
