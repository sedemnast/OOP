package HW5.view;

import HW5.controller.UserController;
import HW5.model.Student;
//import seminar5_homework.model.Teacher;

import java.util.List;

public class StudentView implements UserView<Student> {
    UserController<Student> controller;

    public StudentView(UserController<Student> controller) {
        this.controller = controller;
    }

    @Override
    public void sendOnConsole(String sortType) {
        List<Student> students = switch (sortType) {
            case SortType.NONE -> controller.getAll();
            case SortType.NAME -> controller.getAllSortUsers();
            case SortType.FAMILY -> controller.getAllSortUsersByFamilyName();
            case SortType.AGE -> controller.getAllSortUsersByAge();
            default -> null;
        };
        if (students == null)  {
            System.out.println("students is null");
            return;
        }
        System.out.println("====================================");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("====================================");
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String nameGroup) {
        controller.create(fullName, age, phoneNumber, nameGroup);
    }


    @Override
    public void removeUser(String fullName) {
        controller.removeUser(fullName);
    }

    @Override
    public int getMaxFullName() {
        return controller.getMaxFullName();
    }

    public List<Student> getAll() {
        return controller.getAll();
    }

    public void viewStudent(Student student) {
        if (student == null) {System.out.println("Такого студента нет");}
        else {System.out.println(student);}
    }

    public void viewGroupStudents(List<Student> students) {
        if (students.size() == 0) {
            System.out.println("Студенты в указанной группе отсутствуют");
        }
        else {
            String tx = "";
            if (students.size() == 1) {tx = "Студент";}
            else {tx = "Студенты";}
            System.out.println("======= " + tx + " группы ========");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }


    @Override
    public void buttonClickID() {    }
    public Student getById(int hum) { return controller.getById(hum);}
}
