package HW5.view;

import HW5.model.User;

public interface UserView<T extends User> {
    void sendOnConsole(String sortType);
    void create(String fullName, Integer age, String phoneNumber, String nameGroup);
    void removeUser(String fullName);
    int getMaxFullName();
    void buttonClickID();
    T getById(int hum);
}
