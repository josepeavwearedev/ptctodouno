package com.todouno.pruebatecnica.domain.model;

import com.todouno.pruebatecnica.infraestucture.drivendadpter.ProductData;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductRepository {
    Iterable<ProductData> getAllProducts();

    ProductData saveProduct(ProductData product);

    ProductData updateProduct(ProductData productData, String id);

    void deleteProduct(ProductData productData, String id);
}
