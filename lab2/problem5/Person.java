package lab2.problem5;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;
    private Animal petOnVacation;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public Animal getPet() { return pet; }

    public boolean assignPet(Animal pet) {
        if (this.pet != null) {
            System.out.println(name + " already has a pet!");
            return false;
        }
        this.pet = pet;
        return true;
    }

    public void removePet() {
        this.pet = null;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public abstract String getOccupation();

    public void leavePetWith(Person caretaker) {
        if (!hasPet()) {
            System.out.println(name + " has no pet to leave.");
            return;
        }
        if (caretaker.assignPet(this.pet)) {
            this.petOnVacation = this.pet;
            this.removePet();
        } else {
            System.out.println("Could not leave pet with " + caretaker.getName());
        }
    }

    public void retrievePetFrom(Person caretaker) {
        if (this.petOnVacation != null && caretaker.getPet() == this.petOnVacation) {
            caretaker.removePet();
            this.assignPet(this.petOnVacation);
            this.petOnVacation = null;
        } else {
            System.out.println("Cannot retrieve pet from " + caretaker.getName());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        String petInfo = hasPet() ? pet.toString() : "No pet";
        return name + " (" + age + " y.o., " + getOccupation() + ") -> Pet: [" + petInfo + "]";
    }
}