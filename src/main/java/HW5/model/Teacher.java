package HW5.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;


@Getter
@EqualsAndHashCode(callSuper = true)
public class Teacher extends User implements Comparable<Teacher> {
    public Teacher(Long id, String fullName, Integer age, String phoneNumber, String nameGroup) {

        super(id, fullName, age, phoneNumber, nameGroup);
    }

    private Integer experience;
    private String academicDegree;

    @Override
    public int compareTo(Teacher o) {
        return getFullName().compareTo(o.getFullName()); }

    public String toString() {
        return String.format("Учитель: %s\t%s\t%s\t%s\t%s", getId(), getFullName(), getAge(),
                getPhoneNumber(), getNameGroup());
    }

}
