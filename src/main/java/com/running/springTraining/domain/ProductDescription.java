package com.running.springTraining.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "ProductDescription")
public class ProductDescription {

    @Id
    @GeneratedValue
    private Long id;


    @Column
    private String textDescription;

    @Column
    private String imagelink;

    @OneToMany(mappedBy = "productDescription")
    private List<Comment> comments = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    public void addComment(Comment comment) {
        comments.add(comment);
        comment.setProductDescription(this);

    }

    public void setProduct(Product product){
        this.product = product;
        product.getProduct_Description().add(this);
    }




}
