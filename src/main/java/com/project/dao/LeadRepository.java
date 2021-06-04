package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Lead;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Integer> {

}
