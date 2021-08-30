package com.todouno.pruebatecnica.domain.model;

import com.todouno.pruebatecnica.infraestucture.drivendadpter.ProductData;

public interface ProductRepository {
    Iterable<ProductData> getAllProducts();

    ProductData saveProduct(ProductData product);

    void deleteProduct(ProductData productData);
}
