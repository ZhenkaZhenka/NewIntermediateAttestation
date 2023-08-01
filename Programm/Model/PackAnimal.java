package Model;

import java.time.LocalDate;

public abstract class PackAnimal extends Animal{
    public int loadCapacity = 100;
    public PackAnimal(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
