package com.mcs.be.course.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mcs.be.course.model.Customer;

public interface CustomerDao extends JpaRepository<Customer, String> {

}
