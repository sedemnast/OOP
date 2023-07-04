package HW5.service;


import HW5.model.Student;
import HW5.model.StudyGroup;
import HW5.model.Teacher;


import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    public StudyGroupService(List<Teacher> teachersGroup, List<Student> studentsGroup) {
        this.teachersGroup = teachersGroup;
        this.studentsGroup = studentsGroup;
    }

    private final List<Teacher> teachersGroup;
    private final List<Student> studentsGroup;

    public List<Student> getStudentsGroup() {
        return studentsGroup;
    }

    public List<Teacher> getTeachersGroup() {
        return teachersGroup;
    }

    public List<Teacher> createTeacherGroup(String nameGroup) {
        List<Teacher> lS1 = new ArrayList<Teacher>();
        for (Teacher teacher : teachersGroup) {
            if (teacher.getNameGroup().equals(nameGroup)) {
                lS1.add(teacher);
            }
        }
        return lS1;
    }

    public List<Student> createStudentGroup(String nameGroup) {
        List<Student> lS = new ArrayList<Student>();
        for (Student student : studentsGroup) {
            if (student.getNameGroup().equals(nameGroup)) {
                lS.add(student);
            }
        }
        return lS;
    }

}

