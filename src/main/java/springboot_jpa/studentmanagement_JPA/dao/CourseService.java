package springboot_jpa.studentmanagement_JPA.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot_jpa.studentmanagement_JPA.model.Course;

@Service
public class CourseService {

	@Autowired
	CourseRepository courseRepository;
	
		// Add
		public void addCourse(Course course) {
			courseRepository.save(course);
		}
	
		// Search
		public List<Course> getAllCourse() {
			List<Course> courselist = (List<Course>) courseRepository.findAll();
			return courselist;
		}
		
		public List<Course> getCourseById(String id){
			List<Course> courselist = (List<Course>) courseRepository.findAllByCourseId(id);
			return courselist;
		}
		
}
