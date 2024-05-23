package com.example.wordlyweek.model;

import javax.persistence.*;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.example.wordlyweek.model.Magazine;

@Entity
@Table(name = "writer")
public class Writer {

    @Id
    @Column(name = "writer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int writerId;

    @Column(name = "name")
    private String writerName;

    @Column(name = "bio")
    private String bio;

    @ManyToMany
    @JoinTable(name = "writer_magazine", joinColumns = @JoinColumn(name = "writerId"), inverseJoinColumns = @JoinColumn(name = "magazineId"))
    @JsonIgnoreProperties("writers")
    private List<Magazine> magazines = new ArrayList<>();

    public Writer() {
    }

    public Writer(int writerId, String writerName, String bio, List<Magazine> magazines) {
        this.writerId = writerId;
        this.writerName = writerName;
        this.bio = bio;
        this.magazines = magazines;
    }

    public int getWriterId() {
        return writerId;
    }

    public void setWriterId(int writerId) {
        this.writerId = writerId;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<Magazine> getMagazines() {
        return magazines;
    }

    public void setMagazines(List<Magazine> magazines) {
        this.magazines = magazines;
    }
}