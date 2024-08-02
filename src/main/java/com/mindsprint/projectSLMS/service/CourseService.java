package com.mindsprint.projectSLMS.service;

import com.mindsprint.projectSLMS.models.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getAllCourses();
    public Course saveCourse(Course course);

    public Course updateCourse(Course course, Long id);
    public boolean deleteCourseByName(String title);

}
