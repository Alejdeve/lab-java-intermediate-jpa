package com.tareas.controller;

import com.tareas.model.Task;
import com.tareas.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskservice;

    @GetMapping
    public List<Task> getAllTask() {
        return taskservice.getAllTasks();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskservice.createTask(task);
    }
}
