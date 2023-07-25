package com.running.springTraining.Repository;

import com.running.springTraining.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;


import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;


public interface MemberRepository extends JpaRepository<Member,Long> {




}
