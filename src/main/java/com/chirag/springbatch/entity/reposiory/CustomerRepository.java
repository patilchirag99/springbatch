package com.chirag.springbatch.entity.reposiory;

import com.chirag.springbatch.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CustomerRepository extends JpaRepository<Customer, Serializable> {
}
