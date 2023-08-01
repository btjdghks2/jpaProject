package com.running.springTraining.Repository;

import com.running.springTraining.Dto.Main.MainListDto;
import com.running.springTraining.domain.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;



public interface MainPageRepository extends JpaRepository<Product,Long> {

    @Override
    List<Product> findAll();
}
