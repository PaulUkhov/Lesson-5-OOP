package model;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> studentList;

    public StudyGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher +
                ", studentList=" + studentList +
                '}';
    }
}