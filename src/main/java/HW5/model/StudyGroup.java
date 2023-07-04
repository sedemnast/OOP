package HW5.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

@Getter
//@AllArgsConstructor
//@Setter
//@ToString
//@AllArgsConstructor

public class StudyGroup {
    public StudyGroup(Teacher teacher, List<Student> studentsGroup) {
        this.teacher = teacher;
        this.studentsGroup = studentsGroup;
    }

    private Teacher teacher;
    private List<Student> studentsGroup;

    public List<Student> getStudentsGroup() {
        return studentsGroup;
    }

    public void setStudentsGroup(List<Student> studentsGroup) {
        this.studentsGroup = studentsGroup;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}

