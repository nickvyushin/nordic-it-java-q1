package com.filit.lesson7.homework.com.zoo.animal;

import com.filit.lesson7.homework.com.zoo.exceptions.AviaryExistsException;

import java.util.HashMap;

public class Aviaries {

    HashMap<Integer, Aviary> aviaries = new HashMap<>();

    public void addAviaryInList(int i, Aviary aviary) throws AviaryExistsException {
        if (aviaries.containsKey(i)) {
            throw new AviaryExistsException("Такой вольер существует!");
        } else {
            aviaries.put(i, aviary);
        }
    }
}
