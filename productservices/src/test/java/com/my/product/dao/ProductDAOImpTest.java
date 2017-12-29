package com.my.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.my.product.dto.Product;

public class ProductDAOImpTest {

	@Test
	public void ProductTest() {
		ProductDAO dao = new ProductDAOImp();
		Product pro=new Product();
		pro.setId(1);
		pro.setName("IPhone");
		pro.setDescription("wow");
		pro.setPrice(1000);
		dao.create(pro);
		
		Product result = dao.read(1);
		assertNotNull(result);
		assertEquals("IPhone", result.getName());
	}

}
