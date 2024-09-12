package com.tareas.repository;

import com.tareas.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
