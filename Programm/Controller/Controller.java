package Controller;

import Model.Animal;
import Model.AnimalKind;
import Model.KindOfAnimals.*;
import PetStorage.AnimalStorage;

import java.time.LocalDate;
import java.util.List;

public class Controller {
    /**
     * Отвечает за взаимодействие View и Model
     */
     private AnimalStorage dbKennel;
     public Controller(AnimalStorage dbKennel) {
            this.dbKennel = dbKennel;
        }

    public Controller() {
    }

    public List<Animal> getAnimals() {
            return dbKennel.getAllAnimals();
        }

    public boolean createAnimal(String name, LocalDate birthDay, AnimalKind animalKind) {
        Animal animal = switch (animalKind) {
             case CAT -> new Cat(name, birthDay);
             case DOG -> new Dog(name, birthDay);
             case HAMSTER -> new Hamster(name, birthDay);
             case HORSE -> new Horse(name, birthDay);
             case CAMEL -> new Camel(name, birthDay);
             case DONKEY -> new Donkey(name, birthDay);
            };
            return dbKennel.addAnimal(animal);
        }

        public int removeAnimal(Animal animal) {
            if (animal == null) return -1;
            return  dbKennel.removeAnimal(animal);
        }
    }
