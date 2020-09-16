package com.filit.lesson7.homework.com.zoo.animal;

import com.filit.lesson7.homework.com.zoo.exceptions.AnimalAlreadyInAviaryException;
import com.filit.lesson7.homework.com.zoo.exceptions.AviaryNotFoundException;
import com.filit.lesson7.homework.com.zoo.exceptions.LimitException;

import java.util.HashMap;

public class Aviaries {

    HashMap<Integer, Aviary> aviaries = new HashMap<>();

    public void create(int i, Aviary av) {
        aviaries.put(i, av);
    }

    public void add(int i, Animal an) throws AnimalAlreadyInAviaryException, LimitException, AviaryNotFoundException {
        if (aviaries.containsKey(i)) {
            aviaries.get(i).add(an);
        } else {
            throw new AviaryNotFoundException("Вальер не найден!");
        }
    }

}
