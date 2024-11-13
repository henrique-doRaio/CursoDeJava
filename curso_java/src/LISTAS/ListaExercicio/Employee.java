package LISTAS.ListaExercicio;

public class Employee {
    private Integer id;
    private String nome;
    private Double salary;

    public Employee(){

    }
    public Employee(Integer id , String name , Double salary){
        this.id = id;
        this.nome = name;
        this.salary = salary;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void increaseSalary(Double percentage){
        salary = salary + salary * percentage / 100.0;
    }

    public String toString() {
        return id + " , " + nome + " , " + String.format("%.2f", salary);
    }
}
