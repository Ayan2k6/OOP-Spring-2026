package lab3.problem4;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    // Accessor methods (Геттеры) 
    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    // Сравнение сотрудников по зарплате
    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    // Клонирование сотрудника с глубоким копированием даты
    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.hireDate = (Date) hireDate.clone();
        return cloned;
    }

    // Сравнение объектов 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && 
               Objects.equals(hireDate, employee.hireDate) && 
               Objects.equals(insuranceNumber, employee.insuranceNumber);
    }

    // Текстовое представление 
    @Override
    public String toString() {
        return super.toString() + 
               ", Employee[salary=" + salary + 
               ", hireDate=" + hireDate + 
               ", insurance=" + insuranceNumber + "]";
    }
}