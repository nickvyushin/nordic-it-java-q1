package com.filit.lesson16.homework;

import java.util.Iterator;
import java.util.Objects;

public class MyIntegerIterator implements Iterable<String>{

    private String number;

    public MyIntegerIterator() {
        super();
    }

    public MyIntegerIterator(Integer number) {
        this.number = number.toString();
    }

    public Integer getNumber() {
        return Integer.parseInt(number);
    }

    public void setNumber(Integer number) {
        this.number = number.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyIntegerIterator strings = (MyIntegerIterator) o;
        return Objects.equals(number, strings.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public Iterator<String> iterator() {
        return new NewMyIntegerIterator();
    }

    public class NewMyIntegerIterator implements Iterator<String> {

        private int posNumber = number.length() - 1;

        @Override
        public boolean hasNext() {
            return posNumber > 0;
        }

        @Override
        public String next() {
            String resultReverse = "";
            while (posNumber >= 0) {
                resultReverse += number.charAt(posNumber);
                posNumber--;
            }
            return resultReverse;
        }
    }

}
