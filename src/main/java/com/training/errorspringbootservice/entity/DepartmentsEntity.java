package com.training.errorspringbootservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="departments")
public class DepartmentsEntity implements Serializable{
    
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="dep_id")
    private Long depId;

    @Column(name="dep_name")
    private String depName;

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    
    
}
