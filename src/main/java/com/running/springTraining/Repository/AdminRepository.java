package com.running.springTraining.Repository;

import com.running.springTraining.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Product,Long> {


}
