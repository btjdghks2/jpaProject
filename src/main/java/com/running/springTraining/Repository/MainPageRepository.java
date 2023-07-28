package com.running.springTraining.Repository;

import com.running.springTraining.domain.Product;

import com.running.springTraining.domain.ProductDescription;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class MainPageRepository {

    @PersistenceContext
    EntityManager em;

    public Product save(Long id) {
        return em.find(Product.class, id);
    }

    public List<Product> MainList() {
        return em.createQuery("select p from Product p", Product.class)
                .getResultList();
    }

    public List<ProductDescription> DetailPage() {
        return em.createQuery("select p from ProductDescripition p",ProductDescription.class)
                .getResultList();
    }













}
