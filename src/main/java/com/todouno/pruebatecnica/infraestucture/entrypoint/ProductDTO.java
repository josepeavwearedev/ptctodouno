package com.todouno.pruebatecnica.infraestucture.entrypoint;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDTO {
    private String id;
    private String name;
    private String description;
    private Long quantity;
}
