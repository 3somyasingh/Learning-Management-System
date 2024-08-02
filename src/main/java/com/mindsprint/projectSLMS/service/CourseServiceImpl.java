package com.mindsprint.projectSLMS.service;

import com.mindsprint.projectSLMS.models.Course;
import com.mindsprint.projectSLMS.models.Student;
import com.mindsprint.projectSLMS.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseRepo courseRepo;

    @Override
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public Course updateCourse(Course course, Long id) {
        if(courseRepo.findById(id).isPresent()){
            Course oldCourse = courseRepo.findById(id).get();
            oldCourse.setTitle(course.getTitle());
            return courseRepo.save(oldCourse);
        }else
            return null;
    }


    @Override
    public boolean deleteCourseByName(String title) {
        Course course = courseRepo.findByTitle(title);
        if(course!=null){
            courseRepo.deleteById(course.getId());
            return true;
        }else
            return false;
    }
}