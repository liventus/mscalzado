package com.lizana.mscalzado.infraestructure.adapter.repository;

import com.lizana.mscalzado.infraestructure.adapter.entity.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<StudentEntity, String> {

    //Flux<StudentEntity> findByStatus(String status);
    //Mono<StudentEntity> findById(String id);
}