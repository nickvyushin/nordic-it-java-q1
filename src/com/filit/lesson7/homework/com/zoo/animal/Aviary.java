package com.filit.lesson7.homework.com.zoo.animal;

import com.filit.lesson7.homework.com.zoo.exceptions.AnimalAlreadyInAviaryException;
import com.filit.lesson7.homework.com.zoo.exceptions.LimitException;

import java.util.HashSet;

public class Aviary {

    int limit;
    HashSet<Animal> animals = new HashSet<>();

    //Устанавливается лимит для вольера
    public Aviary(int limit) {
        this.limit = limit;
    }

    //Метод добавляет животное в вольер
    public void add(Animal animal) throws AnimalAlreadyInAviaryException, LimitException {
        if (animals.size() == limit) {
            throw new LimitException("Места нет!!!");
        }
        boolean addAnimal = animals.add(animal);
        if (addAnimal) {
            System.out.println("Животное добавлено!");
        } else {
            throw new AnimalAlreadyInAviaryException("Животное уже в вольере!");
        }

    }

    //Метод удаляет животное из вольера
    public void delete(Animal animal) {
        animals.remove(animal);
    }

    //Метод выводит список животных в вольере
    public void print() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
