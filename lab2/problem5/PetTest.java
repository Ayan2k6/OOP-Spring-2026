package lab2.problem5;

public class PetTest {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");
        Animal murka = new Cat("Murka", 5);
        
        john.assignPet(murka);
        
        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        
        System.out.println("BEFORE VACATION:");
        System.out.println(registry);
        
        john.leavePetWith(alice);
        
        System.out.println("\nDURING VACATION:");
        System.out.println(registry);
        
        john.retrievePetFrom(alice);
        
        System.out.println("\nAFTER VACATION:");
        System.out.println(registry);
        
        System.out.println("\n--- TESTING PHD DOG RESTRICTION ---");
        Person bob = new Employee("Bob", 40, "Manager");
        Animal rex = new Dog("Rex", 3);
        bob.assignPet(rex);
        
        bob.leavePetWith(alice); 
    }
}