package com.todouno.pruebatecnica.infraestucture.drivendadpter;

import com.todouno.pruebatecnica.domain.model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepositoryAdapater implements ProductRepository {

    @Autowired
    ProductDataRepository productDataRepository;

    @Override
    public Iterable<ProductData> getAllProducts() {
        return productDataRepository.findAll();
    }

    @Override
    public ProductData saveProduct(ProductData product) {
        return productDataRepository.save(product);
    }

    @Override
    public void deleteProduct(ProductData productData) {
        productDataRepository.delete(productData);
    }

}
