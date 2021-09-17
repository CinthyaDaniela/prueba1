package com.example.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.modelo.ProductoDTO;
@Repository

public interface IproductoDAO extends MongoRepository<ProductoDTO,String> {

	

}
