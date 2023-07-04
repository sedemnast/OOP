package HW5.view;

import HW5.controller.UserController;
import HW5.model.Teacher;

import java.util.List;
import java.util.Scanner;

public class TeacherView implements UserView<Teacher> {
    UserController<Teacher> controller;

    public TeacherView(UserController<Teacher> controller) {
        this.controller = controller;
    }

    @Override
    public void sendOnConsole(String sortType) {
        List<Teacher> teachers = switch (sortType) {
            case SortType.NONE -> controller.getAll();
            case SortType.NAME -> controller.getAllSortUsers();
            case SortType.FAMILY -> controller.getAllSortUsersByFamilyName();
            case SortType.AGE -> controller.getAllSortUsersByAge();
            default -> null;
        };
        if (teachers == null) {
            System.out.println("Учителя в списке отсутствуют");
            return;
        }
        System.out.println("====================================");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        System.out.println("====================================");
    }


    @Override
    public void create(String fullName, Integer age, String phoneNumber, String nameGroup) {
        controller.create(fullName, age, phoneNumber, nameGroup);
    }

    @Override
    public int getMaxFullName() {
        return controller.getMaxFullName();
    }

    @Override
    public void removeUser(String fullName) {
        controller.removeUser(fullName);
    }

    public void viewTeacher(Teacher teacher) {
        if (teacher == null) {System.out.println("Такого преподавателя нет");}
        System.out.println(teacher);
    }

    public void viewGroupTeachers(List<Teacher> teachers) {
        if (teachers.size() == 0) {
            System.out.println("Преподаватели в указанной группе отсутствуют");
        }
        else {
            String tx = "";
            if (teachers.size() == 1) {
                tx = "Преподаватель";
            } else {
                tx = "Преподаватели";
            }
            System.out.println("======= " + tx + " группы ========");
            for (Teacher teacher : teachers) {
                System.out.println(teacher);
            }
        }
    }

    public void buttonClickID() {
        controller.buttonClickID();
    }

    public List<Teacher> getAll() {
        return controller.getAll();
    }

    public Teacher getById(int hum) { return controller.getById(hum);}
}