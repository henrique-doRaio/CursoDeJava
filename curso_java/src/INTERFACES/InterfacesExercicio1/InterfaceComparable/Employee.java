package INTERFACES.InterfacesExercicio1.InterfaceComparable;

public class Employee implements Comparable<Employee> {
    private String name;
    private Double salary;

    public Employee(String field, double v) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(Employee o) {
        return name.compareTo(getName());
    }
}
