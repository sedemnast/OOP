package HW3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private final List<Student> studentsList;

    public StudentGroup() {
        studentsList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(studentsList);
    }
}