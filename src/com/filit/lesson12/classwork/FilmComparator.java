package com.filit.lesson12.classwork;

import java.util.Comparator;

public class FilmComparator implements Comparator<Film> {
    @Override
    public int compare(Film o1, Film o2) {
        if (o1.getGenre().equals(o2.getGenre()))
            return o1.getTime().compareTo(o2.getTime());
        else
            return o1.getGenre().compareTo(o2.getGenre());
    }
}
