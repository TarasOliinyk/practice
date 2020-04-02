import com.lits.config.JavaConfig;
import com.lits.model.Course;
import com.lits.service.CourseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainForCourse {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        CourseService courseService = context.getBean(CourseService.class);

        // Add course:
        Course course = new Course();
        course.setName("Chemistry");
        courseService.addCourse(course);

        // Get course:
//        Course course = courseService.getCourse(1);
//        System.out.println(course.toString());

        // Get all courses:
//        List<Course> courses = courseService.getAllCourses();
//        courses.forEach(course -> System.out.println(course.toString()));

        // Update course:
//        Course course = new Course();
//        course.setId(2);
//        course.setName("Programming");
//        Course updateCourse = courseService.updateCourse(course);
//        System.out.println(updateCourse.toString());

        // Delete Course:
//        courseService.deleteCourse(2);
    }
}
