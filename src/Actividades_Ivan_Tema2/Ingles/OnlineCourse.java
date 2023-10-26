package Actividades_Ivan_Tema2.Ingles;

import java.util.Arrays;

public class OnlineCourse {

    private String name;
    private String ID;
    private int duration;
    private String teacher;


    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.length()<4) {
            this.name = name;
        }
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {

        char first = getName().charAt(0);
        char second = getTeacher().charAt(ID.length()-1);
        String ide = ""+first+second;
        this.ID = ide;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration>30) {
            this.duration = duration;
        }
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        String [] parts = teacher.split(" ");
        this.teacher = parts.toString();
    }

    @Override
    public String toString() {
        return "OnlineCourse{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", duration=" + duration +
                ", teacher='" + teacher + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
