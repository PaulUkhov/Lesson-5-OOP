package service;

import model.Student;
import model.StudyGroup;
import model.Teacher;
import model.Type;

import java.util.List;

//todo— Создать класс УчебнаяГруппаСервис, в котором реализована функция (входные параметры - (Teacher, List<Student>))
//todo формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;
import java.util.List;

public class StudyGroupService {

    // Метод для создания учебной группы
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }

    // Метод для получения ID студента по списку
    public Student getStudentById(List<Student> students, int id) {
        for (Student student : students) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null; // Студент не найден
    }

    // Метод для получения ID преподавателя
    public Teacher getTeacherById(Teacher teacher, int id) {
        if (teacher.getTeacherId() == id) {
            return teacher;
        }
        return null; // Преподаватель не найден
    }
}
