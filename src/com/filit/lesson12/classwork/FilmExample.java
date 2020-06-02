package com.filit.lesson12.classwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class FilmExample {

    public static void main(String[] args) {
        var film1 = new Film("Властелин колец: Братство Кольца", 5, "США", 218, "Фентези");
        var film2 = new Film("Ирония судьбы", 5, "СССР", 184, "Комедия");
        var film3 = new Film("Горбатая гора", 4, "США", 134, "Драма");
        var film4 = new Film("Гарри Поттер и Филосовский камень", 5, "США/Великобритания", 159, "Фентези");
      //  var film5 = new Film("Джемс ")

        var filmCollection = new TreeSet<Film>();
        filmCollection.add(film1);
        filmCollection.add(film2);
        filmCollection.add(film3);
        filmCollection.add(film4);

        var coll = new ArrayList<Film>();
        coll.add(film1);
        coll.add(film2);
        coll.add(film3);
        coll.add(film4);

        coll.sort(new FilmComparator().reversed());

  //      for (var film : coll) {
   //         System.out.println(film);
  //      }

        var myFilmCollection = new FilmCollection();
        myFilmCollection.add(film1);
        myFilmCollection.add(film2);
        myFilmCollection.add(film3);
        myFilmCollection.add(film4);

 //       for (var film : myFilmCollection)
  //          System.out.println(film);

        Iterator<Film> iterator = myFilmCollection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
