package com.Greg.dao;

import com.Greg.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {

    public static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(20, "Mustang", "FORD","rouge",98000));
        products.add(new Product(5, "BUGATTI", "Divo","noir",239000));
        products.add(new Product(46, "Model S", "Tesla","Blanc",75000));
        products.add(new Product(93, "720s", "McLAREN","bleu",750000));
        products.add(new Product(30, "308", "PEUGEOT","Gris",27000));

    }


    @Override
    public List<Product> findAll() {

        return products;
    }

    @Override
    public Product findById(int id) {
        for (Product product:products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product save(Product product) {
        return null;
    }
}
