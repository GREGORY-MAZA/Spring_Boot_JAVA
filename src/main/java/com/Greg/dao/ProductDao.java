package com.Greg.dao;

import com.Greg.model.Product;
import java.util.List;

public interface ProductDao {

    public List<Product> findAll();

    public Product findById(int id);

    public Product save(Product product);
}

