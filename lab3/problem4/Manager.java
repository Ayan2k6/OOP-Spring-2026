package lab3.problem4;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double salary, Date hireDate, String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public void addEmployee(Employee e) {
        team.add(e);
    }

    @Override
    public int compareTo(Employee other) {
        int res = super.compareTo(other);
        if (res == 0 && other instanceof Manager) {
            return Double.compare(this.bonus, ((Manager) other).bonus);
        }
        return res;
    }

    @Override
    public Manager clone() throws CloneNotSupportedException {
        Manager cloned = (Manager) super.clone();
        cloned.team = new Vector<>();
        for (Employee e : this.team) {
            cloned.team.add(e.clone()); // Глубокое копирование команды
        }
        return cloned;
    }

    @Override
    public String toString() {
        return super.toString() + ", Manager[bonus=" + bonus + ", teamSize=" + team.size() + "]";
    }
}