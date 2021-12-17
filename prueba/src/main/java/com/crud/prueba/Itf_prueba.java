package com.crud.prueba;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.Md_prueba;

@Repository
public interface Itf_prueba extends JpaRepository<Md_prueba, Integer> {

}
