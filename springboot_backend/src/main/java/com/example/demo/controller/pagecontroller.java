package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Employee;
import com.example.demo.respsotory.StudentRepository;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class pagecontroller {

    @Autowired
    private StudentRepository repository;

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee) {
        return repository.save(employee);
    }

    @GetMapping("/all")
    public List<Employee> getAll() {
        return repository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}