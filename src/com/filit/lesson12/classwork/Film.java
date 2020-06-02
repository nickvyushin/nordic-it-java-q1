package com.filit.lesson12.classwork;

import java.util.Objects;

public class Film implements Comparable <Film> {
    private String name;
    private Integer rating;
    private String country;
    private Integer time;
    private String genre;

    public Film() {
    }

    public Film(String name, Integer rating, String country, Integer time, String genre) {
        this.name = name;
        this.rating = rating;
        this.country = country;
        this.time = time;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", country='" + country + '\'' +
                ", time=" + time +
                ", genre='" + genre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Film o) {

        if (this.rating.equals(o.rating))
            return this.time.compareTo(o.time);
        else if (this.time.equals(o.time))
            return this.country.compareTo(o.country);
        else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Film)) return false;
        Film film = (Film) o;
        return Objects.equals(name, film.name) &&
                Objects.equals(country, film.country) &&
                Objects.equals(time, film.time) &&
                Objects.equals(genre, film.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating, country, time, genre);
    }
}
