package HW5.service;

import HW5.model.User;

import java.util.List;

public interface UserService<T extends User> {
    void create(String fullName, Integer age, String phoneNumber, String nameGroup);
    List<T> getAll();
    List<T> getAllSortUsers();
    List<T> getAllSortUsersByFamilyName();
    List<T> getAllSortUsersByAge();
    void removeUser(String fullName);
    int getMaxFullName();
    void buttonClickID();
    T getById(int hum);
    //List<T> getByNameGroup(String nameGroup);

}
