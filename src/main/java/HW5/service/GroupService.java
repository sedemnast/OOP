package HW5.service;

import HW5.model.StudyGroup;

public interface GroupService<T extends StudyGroup> {
    void createGroup(String nameGroup);
}
