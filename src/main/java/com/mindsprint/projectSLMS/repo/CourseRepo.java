package com.mindsprint.projectSLMS.repo;

import com.mindsprint.projectSLMS.models.Course;
import com.mindsprint.projectSLMS.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Long> {
    public Course findByTitle(String title);
}
