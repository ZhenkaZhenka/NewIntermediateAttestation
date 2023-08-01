package Model.KindOfAnimals;

import Model.PackAnimal;

import java.time.LocalDate;

import static Model.AnimalKind.HORSE;

public class Horse extends PackAnimal {
    public Horse(String name, LocalDate birthDate) {
        super(name, birthDate);
        setKind(HORSE);
    }
}
