package Actividades_Ivan_Tema2.Ingles;

import java.util.Objects;

public class BusinessCourse extends Course {

    private int intership;



    public int getIntership() {
        return intership;
    }

    public void setIntership(int intership) {

        if (intership>15) {
            this.intership = intership + 30;
        }
    }

    public BusinessCourse(int intership) {
        this.intership = intership;
    }

    @Override
    public String toString() {
        return "BusinessCourse{" +
                "intership=" + intership +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BusinessCourse that = (BusinessCourse) o;
        return intership == that.intership;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
