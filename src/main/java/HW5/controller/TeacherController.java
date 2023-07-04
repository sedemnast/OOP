package HW5.controller;

import HW5.model.Teacher;
import HW5.service.TeacherService;
import HW5.service.UserService;

import java.util.List;

public class TeacherController implements UserController<Teacher> {

    public UserService<Teacher> teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String nameGroup) {
        teacherService.create(fullName, age, phoneNumber, nameGroup);
    }

    @Override
    public List<Teacher> getAllSortUsers() {
        return teacherService.getAllSortUsers();
    }

    @Override
    public List<Teacher> getAllSortUsersByFamilyName() {
        return teacherService.getAllSortUsersByFamilyName();
    }

    @Override
    public boolean removeUser(String fullName) {
        teacherService.removeUser(fullName);
        return true;
    }

    @Override
    public List<Teacher> getAll() {
        return teacherService.getAll();
    }


    public int getMaxFullName() {
        return teacherService.getMaxFullName();
    }

    @Override
    public List<Teacher> getAllSortUsersByAge() {
        return teacherService.getAllSortUsersByAge();
    }

    public void buttonClickID() {
        teacherService.buttonClickID();
    }

    public Teacher getById(int hum) { return teacherService.getById(hum);}
}



