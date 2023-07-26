package com.running.springTraining.Repository;

import com.running.springTraining.domain.Product;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;


public interface MainPageRepository extends JpaRepository<Product, Long> {

    @Override
    List<Product> findAll();




}
