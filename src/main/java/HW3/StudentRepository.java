package HW3;

import lombok.Getter;

import java.util.Objects;

@Getter
public final class StudentRepository {
    private final StudentGroup studentGroup;

    public StudentRepository(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void addStudent(Student student) {
        studentGroup.addStudent(student);
    }

    public StudentGroup studentGroup() {
        return studentGroup;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (StudentRepository) obj;
        return Objects.equals(this.studentGroup, that.studentGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentGroup);
    }

    @Override
    public String toString() {
        return "StudentRepository[" +
                "studentGroup=" + studentGroup + ']';
    }

}
