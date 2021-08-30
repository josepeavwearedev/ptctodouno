package com.todouno.pruebatecnica.infraestucture.drivendadpter;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDataRepository extends CrudRepository<ProductData, String> {

}
