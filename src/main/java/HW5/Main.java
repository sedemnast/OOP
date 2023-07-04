package HW5;

import HW5.controller.StudentController;
import HW5.controller.TeacherController;
import HW5.repository.StudentRepository;
import HW5.repository.TeacherRepository;
import HW5.service.StudentService;
import HW5.service.StudyGroupService;
import HW5.service.TeacherService;
import HW5.view.SortType;
import HW5.view.StudentView;
import HW5.view.StudyGroupView;
import HW5.view.TeacherView;

public class Main {
    public static void main(String[] args) {
        StudentView view = getStudentView();
//----------------------------------------------------------------------
        view.create("Светлана Иванова", 21, "+79216743625", "2МехМат");
        view.create("Светлана Волкова", 19, "+79114583254", "3ЭКО");
        view.create("Дмитрий Петров", 21, "+79082742254", "4ИнфоТех");
        view.create("Ирина Духанина", 18, "+79501256545", "2МехМат");
        view.create("Мирослава Агзамова", 22, "+79994515843", "4ИнфоТех");
        view.create("Сергей Нугманов", 23, "+79902135493", "2МехМат");
        view.create("Марина Болконская", 18, "+79743725498", "3ЭКО");
        view.create("Ирина Светлова", 21, "+79324352756", "4ИнфоТех");

        System.out.println("\n---- Учащиеся ----\n");
        view.sendOnConsole(SortType.NONE);

        System.out.println("\n---- Преподаватели ----\n");

        TeacherView view1 = getTeacherView();
        view1.create("Дмитрий Михайлович Кузьминский", 47, "+7905345217", "4ИнфоТех");
        view1.create("Антон Максимович Зайцев", 41, "+79113840432", "2МехМат");
        view1.create("Марина Ивановна Мироненко", 53, "+79123462387", "3ЭКО");
        view1.create("Инна Андреевна Лукина", 33, "+79164563421", "1Био");
        view1.create("Роман Васильевич Шастов", 62, "+79222345427", "4ИнфоТех");

        view1.sendOnConsole(SortType.NONE);
        StudyGroupView studyGroupView = new StudyGroupView();

        view1.viewTeacher(view1.getById(4));
        view.viewStudent(view.getById(3));
        view.viewStudent(view.getById(9));


        String nameGr = studyGroupView.getValue("\nВведите группу: ");
        StudyGroupService studService = new StudyGroupService(view1.getAll(), view.getAll());
        view1.viewGroupTeachers(studService.createTeacherGroup(nameGr));
        view.viewGroupStudents(studService.createStudentGroup(nameGr));
    }


    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }

    public static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }

}