package br.com.dio.desafio.dominio;

import java.util.*;

public class Developer {

    private String name;
    private Set<Content> registrations = new LinkedHashSet<>();
    private Set<Content> concludedContents = new LinkedHashSet<>();

    public void doRegistration(Bootcamp bootcamp) {

        this.registrations.addAll(bootcamp.getContents());
        bootcamp.addRegistration(this);
    }

    public void makeProgress() {

        if (this.registrations.isEmpty()) {
            return;
        }

        Content content = this.registrations.iterator().next();
        this.concludedContents.add(content);
        this.registrations.remove(content);
    }

    public double totalXp() {

        Iterator<Content> iterator = this.concludedContents.iterator();
        double soma = 0;
        while (iterator.hasNext()) {
            soma += iterator.next().xp();
        }
        return soma;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public Set<Content> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(Set<Content> ContentsInscritos) {
        this.registrations = ContentsInscritos;
    }

    public Set<Content> getConcludedContents() {
        return concludedContents;
    }

    public void setConcludedContents(Set<Content> ContentsConcluidos) {
        this.concludedContents = ContentsConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Developer dev = (Developer) o;
        return (Objects.equals(name, dev.name)
                && Objects.equals(registrations, dev.registrations)
                && Objects.equals(concludedContents, dev.concludedContents));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, registrations, concludedContents);
    }
}
