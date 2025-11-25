package br.com.dio.desafio.dominio;

public class Course extends Content {

    private int workload;

    @Override
    public double xp() {
        return XP_DEFAULT * workload;
    }

    public Course() {
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workLoad) {
        this.workload = workLoad;
    }

    @Override
    public String toString() {

        String format = "Course { Title: %s, Description: %s, Workload: %s }";

        return String.format(format, getTitle(), getDescription(), getWorkload());
    }
}
