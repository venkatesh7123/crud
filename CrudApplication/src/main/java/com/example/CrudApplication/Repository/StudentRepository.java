package com.example.CrudApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CrudApplication.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
