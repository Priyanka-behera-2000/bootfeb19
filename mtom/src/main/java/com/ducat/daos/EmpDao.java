package com.ducat.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ducat.entities.*;

@Repository
public interface EmpDao extends 
					JpaRepository<Emp, Integer>{

}
