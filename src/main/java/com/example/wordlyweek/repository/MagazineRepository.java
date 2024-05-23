package com.example.wordlyweek.repository;

import com.example.wordlyweek.model.Magazine;
import com.example.wordlyweek.model.Writer;
import java.util.*;

public interface MagazineRepository {
    ArrayList<Magazine> getMagazines();

    Magazine getMagazineById(int magazineId);

    Magazine addMagazine(Magazine magazine);

    Magazine updateMagazine(int magazineId, Magazine magazine);

    void deleteMagazine(int magazineId);

    List<Writer> getMagazineWriter(int magazineId);
}