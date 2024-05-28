package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Jogador;



@Repository
public interface IJogadorRepository extends CrudRepository<Jogador, Long>{

}