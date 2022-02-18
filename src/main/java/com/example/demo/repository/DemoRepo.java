package com.example.demo.repository;

import com.example.demo.dto.Demo;
import org.springframework.data.repository.CrudRepository;

public interface DemoRepo extends CrudRepository<Demo,Integer> {
}
