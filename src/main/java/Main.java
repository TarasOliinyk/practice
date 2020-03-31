import com.lits.config.JavaConfig;
import com.lits.model.Teacher;
import com.lits.service.TeacherService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setFirstName("John");
        teacher.setLastName("Travolta");
        TeacherService teacherService = context.getBean(TeacherService.class);
        teacherService.add(teacher);
    }
}
