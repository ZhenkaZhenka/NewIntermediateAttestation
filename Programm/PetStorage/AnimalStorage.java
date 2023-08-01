package PetStorage;

import Model.Animal;
import Model.Command;
import Model.KindOfAnimals.*;
import Model.PackAnimal;
import Model.Pet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class AnimalStorage implements Storage{
        Map<Integer, Animal> dbAnimals = new HashMap<>();

        public AnimalStorage() {
            init();
        }

        private void init(){
            Pet cat = new Cat("Эльза", LocalDate.of(2022, 7, 12));

            int per = cat.getAge();

            cat.learnSkill(new Command("Принести тапки"));
            dbAnimals.put(cat.getId(), cat);

            Pet dog = new Dog("Песик", LocalDate.of(2023, 1, 24));
            dog.learnSkill(new Command("Принести тапки"));
            dog.learnSkill(new Command("Поклон!"));
            dbAnimals.put(dog.getId(), dog);

            Pet hamster = new Hamster("Хомяк", LocalDate.of(2022, 12, 20));
            hamster.learnSkill(new Command("Вертеться в колесе"));
            dbAnimals.put(hamster.getId(), hamster);

            PackAnimal horse = new Horse("Гнедой", LocalDate.of(2021, 2, 4));
            horse.setLoadCapacity(300);
            horse.learnSkill(new Command("Галоп!"));
            dbAnimals.put(horse.getId(), horse);

            PackAnimal horse2 = new Horse("Гнедой_2", LocalDate.of(2022, 12, 1));
            horse2.setLoadCapacity(400);
            horse2.learnSkill(new Command("Галоп!"));
            horse2.learnSkill(new Command("Поклон!"));
            dbAnimals.put(horse2.getId(), horse2);

            PackAnimal donkey = new Donkey("Тупица", LocalDate.of(2020, 8, 24));
            donkey.setLoadCapacity(500);
            donkey.learnSkill(new Command("Поклон!"));
            dbAnimals.put(donkey.getId(), donkey);

            PackAnimal camel = new Camel("Рыжий", LocalDate.of(2020, 5, 20));
            camel.setLoadCapacity(1000);
            camel.learnSkill(new Command("КАШ!"));
            dbAnimals.put(camel.getId(), camel);
        }
        @Override
        public List<Animal> getAllAnimals() {
            List<Animal> result = new ArrayList<>();
            for (Animal animal: dbAnimals.values()) {
                result.add(animal);
            }
            return result;
        }

        @Override
        public Animal getAnimalById(int animalId) {
            return dbAnimals.getOrDefault(animalId, null);
        }

        @Override
        public boolean addAnimal(Animal animal) {
            if (dbAnimals.containsKey(animal.getId())) {return false;}
            dbAnimals.put(animal.getId(), animal);
            return true;
        }

        @Override
        public int removeAnimal(Animal animal) {
            if (!dbAnimals.containsKey(animal.getId())) {
                return -1;
            }
            Animal removed = dbAnimals.remove(animal.getId());
            return removed.getId();
        }
    }
