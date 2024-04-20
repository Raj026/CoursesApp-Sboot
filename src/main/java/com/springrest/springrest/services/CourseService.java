package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CourseService {
    public List<Course> getCourses();

    Course getCourse(Integer course);

    Course addCourse(Course course);

    String updateCourse(Course course);

    String deleteCourse(Integer course);
}
