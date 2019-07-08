package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exam.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
