package com.filit.lesson13.classwork;

public class Word implements Comparable<Word> {

    private String word;

    public Word() {
    }

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }


    @Override
    public int compareTo(Word o) {
        return 0;
    }
}
