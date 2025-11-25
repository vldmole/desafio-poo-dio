package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoring extends Content {

    private LocalDate date;

    @Override
    public double xp() {
        return XP_DEFAULT + 20d;
    }

    public Mentoring() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate data) {
        this.date = data;
    }

    @Override
    public String toString() {

        String format = "Mentoring { Title: %s, Description: %s, Date: %s }";

        return String.format(format, getTitle(), getDescription(), getDate());
    }
}
