package com.todouno.pruebatecnica.infraestucture.entrypoint;

import com.todouno.pruebatecnica.domain.usecase.Convertidor;
import com.todouno.pruebatecnica.domain.usecase.ProductUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static com.todouno.pruebatecnica.domain.usecase.Convertidor.convertirDto;

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
    public List<ProductDTO> getProducts() {
        return productUseCase.getAllProducts().stream()
                .map(Convertidor::convertirDto)
                .collect(Collectors.toList());
    }

    @PostMapping(value = "/products")
    public ProductDTO saveProduct(@RequestBody ProductDTO productDto) {
        return convertirDto(productUseCase.saveProduct(productDto));
    }

    @PutMapping(value = "/products/{id}")
    public ProductDTO updateProduct(@RequestBody ProductDTO productDto, @PathVariable String id) {
        return convertirDto(productUseCase.updateProduct(productDto, id));
    }

    @DeleteMapping(value = "/products/{id}")
    public void deleteProduct(@RequestBody ProductDTO productDto,@PathVariable String id) {
        productUseCase.deleteProduct(productDto, id);
    }
}
