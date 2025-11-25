package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate endDate = startDate.plusDays(45);
    private Set<Developer> registrations = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Set<Developer> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(Set<Developer> devsInscritos) {
        this.registrations = devsInscritos;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setConteudos(Set<Content> conteudos) {
        this.contents = conteudos;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Bootcamp bootcamp = (Bootcamp) other;

        return (Objects.equals(name, bootcamp.name)
                && Objects.equals(description, bootcamp.description)
                && Objects.equals(startDate, bootcamp.startDate)
                && Objects.equals(endDate, bootcamp.endDate)
                && Objects.equals(registrations, bootcamp.registrations)
                && Objects.equals(contents, bootcamp.contents));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, startDate, endDate, registrations, contents);
    }

    public void addContent(Content content) {

        if (this.contents.contains(content)) {
            return;
        }

        this.contents.add(content);
    }

    public void addRegistration(Developer developer) {

        if (this.registrations.contains(developer)) {
            return;
        }

        this.registrations.add(developer);
    }
}
