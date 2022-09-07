package com.training.errorspringbootservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.errorspringbootservice.entity.DepartmentsEntity;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentsEntity,Long>{

}