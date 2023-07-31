package com.running.springTraining.Repository;

import com.running.springTraining.domain.Product;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class MainPageRepository {

    @PersistenceContext
    EntityManager em;

    public Long save(Product product) {

         em.persist(product);
         return product.getId();
    }

    public List<Product> MainList() {
        return em.createQuery("select p from Product p", Product.class)
                .getResultList();
    }

    public List<Product> DetailPage() {
        return em.createQuery("select p from ProductDescripition p",Product.class)
                .getResultList();
    }

    public Product findbyitem(Long id) {

        return em.find(Product.class, id);
    }













}
