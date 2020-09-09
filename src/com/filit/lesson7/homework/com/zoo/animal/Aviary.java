package com.filit.lesson7.homework.com.zoo.animal;

import com.filit.lesson7.homework.com.zoo.exceptions.AnimalAlreadyInAviaryException;
import com.filit.lesson7.homework.com.zoo.exceptions.LimitException;

import java.util.ArrayList;

public class Aviary {

    int limit;
    ArrayList<Animal> animals = new ArrayList<Animal>();;

    public Aviary(int limit) {
        this.limit = limit;
    }

    public void add(Animal animal) throws AnimalAlreadyInAviaryException, LimitException {
        if (animals.size() == limit) {
            throw new LimitException("Места нет!!!");
        }
        boolean exist = false;
        //получаем на вход животное
        //проверяем есть ли животное в animals
        for (int i = 0; i < animals.size(); i++) {
            var animalIn = animals.get(i);
            if (animal == animalIn) {
                exist = true;
                break;
            }
        }

        if (exist) {
            //если есть - выдаем ошибку
            throw new AnimalAlreadyInAviaryException("Животное уже в вальере!");
        } else {
            //иначе - добавляем
            animals.add(animal);
        }

    }

    public void delete(Animal a) {
        //ищем животное в animals, которое хотим удалить
        for (int i = 0; i < animals.size(); i++) {
            var animalFromAviary = animals.get(i);
            if (a == animalFromAviary) {
                //удаляем найденое животное из animals
                animals.remove(animalFromAviary);
            }

        }


    }

    public void print() {
        // вытащить животных из листа
        for (var i = 0; i < animals.size(); i++) {
            var a = animals.get(i);
            // распечатать животных
            System.out.println(a);
        }


    }
}
