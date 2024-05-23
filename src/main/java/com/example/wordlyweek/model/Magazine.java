package com.example.wordlyweek.model;

import com.example.wordlyweek.model.Writer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "magazine")
public class Magazine {

    @Id
    @Column(name = "magazine_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int magazineId;

    @Column(name = "title")
    private String magazineName;

    @Column(name = "publication_date")
    private String publicationDate;

    @ManyToMany(mappedBy = "magazines")
    @JsonIgnoreProperties("magazines")
    private List<Writer> writers = new ArrayList<>();

    public Magazine() {
    }

    public Magazine(int magazineId, String magazineName, String publicationDate, List<Writer> writers) {
        this.magazineId = magazineId;
        this.magazineName = magazineName;
        this.publicationDate = publicationDate;
        this.writers = writers;
    }

    public int getMagazineId() {
        return magazineId;
    }

    public void setMagazineId(int magazineId) {
        this.magazineId = magazineId;
    }

    public String getmagazineName() {
        return magazineName;
    }

    public void setMagazineName(String magazineName) {
        this.magazineName = magazineName;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public List<Writer> getWriters() {
        return writers;
    }

    public void setWriter(List<Writer> writers) {
        this.writers = writers;
    }
}