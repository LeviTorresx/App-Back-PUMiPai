package mipai_group.university.platform.service;

import mipai_group.university.platform.data.entity.Course;
import mipai_group.university.platform.data.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course addCourse (Course course) throws Exception{
        if (course == null){
            throw new Exception("Invalid parameter");
        } else if (course.getCode() == null || course.getCode().isEmpty()) {
            throw new Exception("Course-Code is required");
        } else if (course.getName() == null || course.getName().isEmpty()) {
            throw new Exception("Course-Name is required");
        } else if (course.getCredits() == null || course.getCredits() == 0) {
            throw new Exception("Course-Credits requires a value greater than 0");
        } else if (course.getDescription() == null || course.getDescription().isEmpty()) {
            throw new Exception("Course-Description is required");
        } else if (course.getAssignedTeacher() == null) {
            throw new Exception("Course-Teacher is required");
        }
        Optional<Course> existingCourse = courseRepository.findByCode(course.getCode());
        if (existingCourse.isPresent()) {
            throw new Exception("A course with this code already exists");
        }

        return courseRepository.save(course);
    }

    public Optional<Course> getCourse( Long id) throws Exception{

        Optional<Course> course = courseRepository.findById(id);

        if (!course.isPresent()) {
            throw new Exception("Course not found");
        }
        return course;
    }

    public List<Course> getAllCourse() throws Exception{
        try{
          List<Course> courses = courseRepository.findAll();
          if (courses.isEmpty()){
              throw  new Exception("No courses found");
          }
        } catch (Exception e){
            throw new Exception("Error retrieving courses", e);
        }
      return null;
    }

    public void courseDelete(Long id) throws Exception{
        Optional<Course> course = courseRepository.findById(id);
        if (!course.isPresent()){
            throw new Exception("Course not found");
        }
        courseRepository.delete(course.get());
    }

    public Course editCourse(Long id, Course updateCourse) throws Exception {
        Course existingCourse = courseRepository.findById(id)
                .orElseThrow(() -> new Exception("Course not found"));

        if (updateCourse.getName() != null && !updateCourse.getName().isEmpty()) {
            existingCourse.setName(updateCourse.getName());
        }
        if (updateCourse.getCredits() != null && updateCourse.getCredits() > 0) {
            existingCourse.setCredits(updateCourse.getCredits());
        }
        if (updateCourse.getDescription() != null && !updateCourse.getDescription().isEmpty()) {
            existingCourse.setDescription(updateCourse.getDescription());
        }
        if (updateCourse.getStartDate() != null) {
            existingCourse.setStartDate(updateCourse.getStartDate());
        }
        if (updateCourse.getEndDate() != null) {
            existingCourse.setEndDate(updateCourse.getEndDate());
        }
        if (updateCourse.getTasks() != null && !updateCourse.getTasks().isEmpty()) {
            existingCourse.setTasks(updateCourse.getTasks());
        }
        if (updateCourse.getAssignedTeacher() != null) {
            existingCourse.setAssignedTeacher(updateCourse.getAssignedTeacher());
        }

        return courseRepository.save(existingCourse);
    }

}


