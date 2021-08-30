package com.todouno.pruebatecnica.domain.usecase;

import com.todouno.pruebatecnica.domain.model.Product;
import com.todouno.pruebatecnica.infraestucture.drivendadpter.ProductData;
import com.todouno.pruebatecnica.infraestucture.entrypoint.ProductDTO;

public class Convertirdor {
    public static Product convertir(ProductData productData) {
        return new Product(productData.getId(), productData.getName(), productData.getDescription(), productData.getQuantity());
    }

    public static ProductData convertirAData(Product product) {
        return new ProductData(product.getId(), product.getName(), product.getDescription(), product.getQuantity());
    }

    public static ProductData convertirDtoAData(ProductDTO productDto) {
        return new ProductData(productDto.getId(), productDto.getName(), productDto.getDescription(), productDto.getQuantity());
    }

    public static ProductDTO convertirDataADto(ProductData productData) {
        return new ProductDTO(productData.getId(), productData.getName(), productData.getDescription(), productData.getQuantity());
    }
}
