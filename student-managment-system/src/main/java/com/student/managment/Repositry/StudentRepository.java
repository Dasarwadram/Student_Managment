package com.student.managment.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.managment.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
