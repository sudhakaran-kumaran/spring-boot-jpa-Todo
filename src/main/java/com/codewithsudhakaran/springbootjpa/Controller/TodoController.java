package com.codewithsudhakaran.springbootjpa.Controller;

import com.codewithsudhakaran.springbootjpa.Service.TodoService;
import com.codewithsudhakaran.springbootjpa.model.Todo;
import com.codewithsudhakaran.springbootjpa.request.TodoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/all/{userId}")
    public List<Todo> getTodo(@PathVariable int userId) {
        return todoService.findAll(userId);
    }

    @PostMapping("/add")
    public List<Todo> addtodo(@RequestBody TodoRequest todo) {
        return todoService.addTodo(todo);
    }

    @PutMapping("/update")
    public List<Todo> upadate(@RequestBody TodoRequest todo) {
        return todoService.update(todo);
    }

    @DeleteMapping("/delete/{id}")
    public List<Todo> delete(@PathVariable int id) {
        return todoService.delete(id);
    }

}

