package com.todouno.pruebatecnica.infraestucture.entrypoint;

import com.todouno.pruebatecnica.domain.model.Product;
import com.todouno.pruebatecnica.domain.usecase.ProductUseCase;
import com.todouno.pruebatecnica.infraestucture.drivendadpter.ProductData;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
public class Controller {

    private final ProductUseCase productUseCase;

    public Controller(ProductUseCase productUseCase) {
        this.productUseCase = productUseCase;
    }

    @GetMapping(value = "/status")
    public String demo() {
        return "Status: Ok!";
    }

    @GetMapping(value = "/products")
    public Flux<Product> getProducts() {
        return productUseCase.getAllProducts();
    }

    @PostMapping(value = "/products")
    public ProductData saveProduct(@RequestBody ProductDTO productDto) {
        return productUseCase.saveProduct(productDto);
    }

    @PutMapping(value = "/products")
    public ProductData updateProduct(@RequestBody ProductDTO productDto) {
        return productUseCase.updateProduct(productDto);
    }

    @DeleteMapping(value = "/products")
    public void deleteProduct(@RequestBody ProductDTO productDto) {
        productUseCase.deleteProduct(productDto);
    }
}
