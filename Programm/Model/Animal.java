package Model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private static int counter;
    public int id = ++counter;
    public String name;
    public LocalDate birthDate;
    public List<Command> commands;

    public AnimalKind kind;

    public Animal(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public AnimalKind getKind() {
        return kind;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getCommands() {
        String res = "";
        for(Command item : this.commands){
            res += item.getName() + " " +  item.getDescription() + "\n";
        } 
        return res;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }

    public void setKind(AnimalKind kind) {
        this.kind = kind;
    }

    public String getBurthDateAsString() {
        return String.format("%02d-%02d-%4d", birthDate.getDayOfMonth(), birthDate.getMonthValue(),
                birthDate.getYear());
    }

    /**
     * Возвращает возраст живионого в месяцах
     * @return возвраст
     */
    public int getAge() {
        int years = Period.between(birthDate, LocalDate.now()).getYears();
        int months = Period.between(birthDate, LocalDate.now()).getMonths();
        return years * 12 + months;
    }

    /**
     * Добавляет новую команду
     * @param newCommand команды
     * @return true в случае успеха или false - в противном
     */
    public boolean learnSkill(Command newCommand) {
        if (commands.contains(newCommand)){
            return false;
        }
        commands.add(newCommand);
        return true;
    }

    @Override
    public String toString() {
        return "AbstractAnimal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
