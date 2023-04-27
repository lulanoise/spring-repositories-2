package co.develhope.springrepositories2.entities;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

@Entity
@Table

public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "inventor")
    private String inventor;

    @Column(name = "firstAppearance")
    private Date firstAppearance;

    public ProgrammingLanguage() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }

    public Date getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(Date firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public ProgrammingLanguage(int id, @NotNull String name, @NotNull String inventor, Date firstAppearance) {
        this.id = id;
        this.name = name;
        this.inventor = inventor;
        this.firstAppearance = firstAppearance;



    }
}