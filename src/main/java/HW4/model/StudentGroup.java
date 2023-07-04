package HW4.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lombok.Getter;
import lombok.ToString;
import HW4.service.StudentGroupIterator;

@Getter
@ToString
// @Data
public class StudentGroup implements Iterable<Student> {

    private final List<Student> studentsList;

    public StudentGroup() {
        studentsList = new ArrayList<>();
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(studentsList);
    }

}
