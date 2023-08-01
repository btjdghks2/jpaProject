package com.running.springTraining.Repository;

import com.running.springTraining.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public interface AdminRepository extends JpaRepository<Product,Long> {



}
