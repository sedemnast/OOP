package HW5.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
//@AllArgsConstructor
//@Setter
//@ToString
@EqualsAndHashCode(callSuper = true)
//@Data
public class Student extends User implements Comparable<Student> {

    private Double gpa;
    private String advisor;

    public Student(Long id, String fullName, Integer age, String phoneNumber, String nameGroup) {
        super(id, fullName, age, phoneNumber, nameGroup);
    }

    @Override
    public int compareTo(Student o) {
        return getFullName().compareTo(o.getFullName());
    }

    public String toString() {
//        int maxlengthFN = studentRepository.getMaxFullName();
//        getFullName() + " ".repeat(Math.max(0, maxlengthFN - getFullName().length()))
        return String.format("Студент: %s\t%s\t%s\t%s\t%s", getId(), getFullName(),
                getAge(), getPhoneNumber(), getNameGroup());
    }
}
