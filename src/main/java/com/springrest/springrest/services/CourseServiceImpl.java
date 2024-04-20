package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    List<Course> list;
    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(12, "Java", "This course contains basics of java"));
        list.add(new Course(13, "Sboot", "this is a springboot course"));
    }
    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(Integer course) {
        Course c = null;
        for(Course cou:list) {
            if(cou.getId()==course) {
                c = cou;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public String updateCourse(Course course) {
        for(int i=0;i<list.size();i++) {
            if(list.get(i).getId()==course.getId()) {
                int idx = list.get(i).getId();
                System.out.println(idx + " " +i);
                list.set(i, course);
                return String.format("Updated Successfully %d",idx);
            }
        }

        return "Course not found";
    }

    @Override
    public String deleteCourse(Integer course) {
        for(int i=0;i<list.size();i++) {
            if(list.get(i).getId()==course) {
                list.remove(i);
                return String.format("Deleted Successfully %d", i);
            }
        }
        return "No such course found";
    }
}
