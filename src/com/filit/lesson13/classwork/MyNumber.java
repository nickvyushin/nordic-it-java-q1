package com.filit.lesson13.classwork;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyNumber implements Iterable<Integer> {
    private Integer data;

    public MyNumber() {
    }

    public MyNumber(Integer data) {
        this.data = data;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {

    }

    @Override
    public Spliterator<Integer> spliterator() {
        return null;
    }
}

/*    @Override
    public Iterator<Integer> iterator() {
        return new DigitIterator();
    }
    public class DigitIterator implements Iterator<Iterator> {

        private int posIter;

        @Override
        public boolean hasNext() {

            return false;
        }

        @Override
        public Iterator next() {
            return null;
        }
    }
}
*/