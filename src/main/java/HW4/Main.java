package HW4;

import HW4.controller.StudentController;
import HW4.controller.TeacherController;
import HW4.repository.StudentRepository;
import HW4.repository.TeacherRepository;
import HW4.service.StudentService;
import HW4.service.TeacherService;
import HW4.view.SortType;
import HW4.view.StudentView;
import HW4.view.TeacherView;

public class Main {
    public static void main(String[] args) {
        StudentView studentView = getStudentView();
        TeacherView teacherView = getTeacherView();

        studentView.create("Петр Иванов", 19, "343-4343");
        studentView.create("Илона Маслова", 18, "576-7676");
        studentView.create("Илона Маслова", 18, "576-7676");
        studentView.create("Степан Игорев", 20, "456-4554");
        // studentView.sendOnConsole(SortType.NONE);
        studentView.create("Максим Овчинников", 17, "789-9878");
        studentView.create("Екатерина Волкова", 18, "908-0880");
        /*
        studentView.sendOnConsole(SortType.NONE);
        studentView.sendOnConsole(SortType.FIRSTNAME);
        studentView.sendOnConsole(SortType.LASTNAME);
        */
        studentView.sendOnConsole(SortType.AGE);

        teacherView.create("Ирина Духанина", 32, "212-1221");
        teacherView.create("Ирина Духанина", 32, "212-1221");
        teacherView.create("Игорь Верный", 29, "345-4565");
        teacherView.create("Роман Абрамов", 37, "765-5656");
        teacherView.create("Тоня Попова", 40, "978-7878");
        teacherView.create("Соня Горячева", 33, "901-2353");
        teacherView.sendOnConsole(SortType.ID);
        // teacherView.sendOnConsole(SortType.LASTNAME);
        // teacherView.sendOnConsole(SortType.AGE);
        // teacherView.remove("Ираида Полонская");
        // teacherView.sendOnConsole(SortType.NONE);
        teacherView.edit("Роман Абрамов", 37, "765-7575");
        teacherView.sendOnConsole(SortType.ID);

        studentView.edit("Илона Маслова", 18, "576-7676");
        studentView.edit("Илона Маслова", 18, "776-7676");
        studentView.sendOnConsole(SortType.AGE);

    }

    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }

    private static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }
}
