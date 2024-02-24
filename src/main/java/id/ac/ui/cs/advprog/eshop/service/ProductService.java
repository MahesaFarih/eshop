package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Product;
import java.util.List;


public interface ProductService {
    public Product create(Product product);

    public List<Product> findAll();
    public Product deleteProductByName(String name);
    public Product findProductByName(String name);
    public Product editProduct(String name, Product editedProduct);
}
