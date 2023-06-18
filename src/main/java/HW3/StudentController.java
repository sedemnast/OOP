package HW3;

public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void printAll() {
        studentService.printAll();
    }

    public boolean deleteStudent(String fullName) {
        studentService.deleteStudent(fullName);
        return true;
    }

    public void addStudent(Student student) {
        studentService.addStudent(student);
    }
}