package controller;

import model.Student;
import model.StudyGroup;
import model.Teacher;
import service.StudyGroupService;

import java.util.List;

//todo— Создать метод в Контроллере, в котором агрегируются функции получения списка студентов
//        (их id) и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса;
public class Controller {

        private final StudyGroupService studyGroupService = new StudyGroupService();

        // Метод для создания учебной группы
        public StudyGroup createGroup(Teacher teacher, List<Student> students) {
            return studyGroupService.createStudyGroup(teacher, students);
        }

        // Метод для получения студента по ID
        public Student getStudentById(List<Student> students, int id) {
            return studyGroupService.getStudentById(students, id);
        }

        // Метод для получения преподавателя по ID
        public Teacher getTeacherById(Teacher teacher, int id) {
            return studyGroupService.getTeacherById(teacher, id);
        }
    }

