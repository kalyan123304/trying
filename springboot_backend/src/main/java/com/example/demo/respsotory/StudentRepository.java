package com.example.demo.respsotory;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Employee;

public interface StudentRepository extends JpaRepository<Employee, Integer> {

}