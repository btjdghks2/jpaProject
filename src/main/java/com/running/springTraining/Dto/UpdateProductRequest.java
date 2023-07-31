package com.running.springTraining.Dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class UpdateProductRequest {

    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private int productCount;
    @Column
    private String textDescription;
    @Column
    private String imagelink;
}
