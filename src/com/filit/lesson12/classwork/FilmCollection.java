package com.filit.lesson12.classwork;

import java.util.Iterator;

public class FilmCollection implements Iterable<Film>{
    private Film[] data;
    private int pos;

    public FilmCollection() {
        this.data = new Film[10];
        pos = 0;
    }

    public void add(Film film) {
        if (pos >= 10)
            throw new IllegalStateException("Много фильмов!");
        data[pos++] = film;
    }

    public Iterator<Film> iterator() {
        return new FilmIterator();
    }

    public class FilmIterator implements Iterator<Film> {

        private int posIter = 0;

        @Override
        public boolean hasNext() {
            while (posIter < pos && !data[posIter].getCountry().equals("США"))
                posIter++;
            return posIter < pos;
        }

        @Override
        public Film next() {
            return data[posIter++];
        }
    }
}
