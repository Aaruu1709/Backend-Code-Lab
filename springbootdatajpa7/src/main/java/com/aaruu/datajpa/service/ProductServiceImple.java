package com.aaruu.datajpa.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaruu.datajpa.entity.Product;
import com.aaruu.datajpa.reposiory.ProductRepo;

@Service
public class ProductServiceImple implements ProductService {

	@Autowired
	private ProductRepo repo;

	@Override
	public void saveData() {

		List<Product> prodList = Arrays.asList(new Product("Laptop", 2000, 5), new Product("printer", 5000, 4),
				new Product("USB", 2000, 5), new Product("Extension", 5000, 4), new Product("charger", 2000, 5),
				new Product("Pendrive", 500, 4), new Product("keyboard", 2000, 5), new Product("lense", 500, 4),
				new Product("pges", 2000, 5), new Product("mouse", 500, 4)

		);

		repo.saveAll(prodList);

	}

	@Override
	public void findProductByName(String prodName) {
		List<Product> prod = repo.findByProdName(prodName);
		System.out.println("product is:" + prod);

		prod.forEach(p -> System.out.println(p.getProdName() + p.getProdPrice()));
	}

}
