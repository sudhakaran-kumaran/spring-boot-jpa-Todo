package com.codewithsudhakaran.springbootjpa.Respository;

import com.codewithsudhakaran.springbootjpa.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRespository extends JpaRepository<Todo, Integer> {
}
