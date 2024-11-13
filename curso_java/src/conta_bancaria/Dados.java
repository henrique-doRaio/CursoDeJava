package conta_bancaria;
public class Dados {
    private String nome;
    private int number;
    private double balance;

    public Dados(int number , String nome , double depositoInicial) {
        this.nome = nome;
        deposit(depositoInicial);
        this.number = number;
    }

    public Dados(String nome, int number){
        this.nome = nome;
        this.number = number;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public double getBalance() {
        return balance;
    }


    public int getNumber() {
        return number;
    }


    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.00;
    }

    public String toString() {
        return "Account: " + number + " Holder: "+ nome + " Balance: " + balance ;
    }


}
