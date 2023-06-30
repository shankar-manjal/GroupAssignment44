package com.example.groupass.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.groupass.model.Group;

public interface GroupRepository extends JpaRepository<Group,Long>{
	

}
