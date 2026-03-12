package lab2.problem5;

public class PhDStudent extends Person {
    private String major;
    private String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age);
        this.major = major;
        this.researchTopic = researchTopic;
    }

    @Override
    public String getOccupation() {
        return "PhD Student in " + major + ", researching " + researchTopic;
    }

    @Override
    public boolean assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println("Error: PhD students are too busy to have a Dog!");
            return false;
        }
        return super.assignPet(pet);
    }
}
