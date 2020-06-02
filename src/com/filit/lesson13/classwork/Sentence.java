package com.filit.lesson13.classwork;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Sentence implements Iterable<String>{
    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super String> action) {

    }

    @Override
    public Spliterator<String> spliterator() {
        return null;
    }

 /*   private String data;
    public Sentence() {
    }

    public Sentence(String data) {
        this.data = data;
    }

    @Override
    public Iterator<String> iterator() {
        return new WordIterator();
    }
    public class WordIterator implements Iterator<String> {

        private int posIter;

        @Override
        public boolean hasNext() {
            while (posIter < data.length()) {

                if (posIter + 5 > data.length())
                    break;

                int i = 0;
                for (; i < 5; i++) {
                    if (!Character.isLetter(data.charAt(posIter + i))) {
                        break;
                    }
                }
                if (i == 5 && ((posIter + 5 == data.length()) || (posIter + 5 < data.length() && ))
                        Character.isWhitespace(data.charAt(posIter + 5))) {
                    return true;
                }
                while (Character.isLetter(data.charAt(posIter))) {
                    posIter++;
                }
                if (Character.isWhitespace(data.charAt(posIter))) {
                    posIter++;
                }
            }
            return false;
        }

        @Override
        public String next() {
            var word = data.substring(posIter, posIter + 5);
            return null;
        }
    } */
}
