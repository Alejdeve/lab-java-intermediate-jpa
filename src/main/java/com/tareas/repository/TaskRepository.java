package com.tareas.repository;

import com.tareas.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TaskRepository extends JpaRepository<Task, Long> {
}
