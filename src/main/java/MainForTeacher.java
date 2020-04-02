import com.lits.config.JavaConfig;
import com.lits.model.Teacher;
import com.lits.service.TeacherService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainForTeacher {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        TeacherService teacherService = context.getBean(TeacherService.class);

        // Add teacher
        Teacher teacher = new Teacher();
        teacher.setFirstName("Bob");
        teacher.setLastName("Green");
        teacherService.addTeacher(teacher);

        // Get teacher:
//        Teacher teacher = teacherService.getTeacher(3);
//        System.out.println(teacher.toString());

        // Get all teachers:
//        List<Teacher> teachers = teacherService.getAllTeachers();
//        teachers.forEach(teacher -> System.out.println(teacher.toString()));

        // Update teacher:
//        Teacher teacher = new Teacher();
//        teacher.setId(3);
//        teacher.setFirstName("John");
//        teacher.setLastName("Black");
//        Teacher updatedTeacher = teacherService.updateTeacher(teacher);
//        System.out.println(updatedTeacher.toString());

        // Delete teacher:
//        teacherService.deleteTeacher(5);
    }
}
