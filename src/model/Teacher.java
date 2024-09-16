package model;

import java.util.List;

public class Teacher {
    private String name;
    private int teacherId;

    public Teacher(String name, int teacherId) {
        this.name = name;
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", teacherId=" + teacherId +
                '}';
    }
}
