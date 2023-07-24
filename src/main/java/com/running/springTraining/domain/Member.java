package com.running.springTraining.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Members")
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String nickname;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private String adress;


    @OneToMany(mappedBy = "member")
    private List<Cart> carts = new ArrayList<>();




}
