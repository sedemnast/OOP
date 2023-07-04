package HW5.service;

import HW5.model.User;

import java.util.Comparator;

public class UserComparator<T extends User>
        implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int k = (o1.getFullName().split("\\s+")).length; // количество слов в полном имени
        String familyName1 = o1.getFullName().split("\\s+")[k-1];
        String familyName2 = o2.getFullName().split("\\s+")[k-1];
        return familyName1.compareTo(familyName2);
    }
}
