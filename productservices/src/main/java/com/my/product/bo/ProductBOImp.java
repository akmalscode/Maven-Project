package com.my.product.bo;

import com.my.product.dao.ProductDAO;
import com.my.product.dto.Product;

public class ProductBOImp implements ProductBO {
	
	private ProductDAO dao;

	@Override
	public void creat(Product pro) {
		dao.create(pro);

	}

	@Override
	public Product findProduct(int id) {
		
		return dao.read(id);
	}

	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

}
