package com.mindsprint.projectSLMS.repo;

import com.mindsprint.projectSLMS.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
    public Student findByEmail(String email);
}
