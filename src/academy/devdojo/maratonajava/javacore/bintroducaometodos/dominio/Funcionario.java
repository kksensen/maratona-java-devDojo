package academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario = new double[3];
    private double media;

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        int count = 1;
        if (salario == null) {
            return;
        } else {
            for (double num : this.salario) {
                System.out.printf("Salario %d: %.2f%n", count, num);
                count += 1;
            }
            mediaSalarios();
        }
    }

    public void mediaSalarios() {

        if (salario == null) {
            return;
        } else {
            for (double num : this.salario) {
                this.media += num;
            }
            System.out.printf("A média dos salarios é de: %.2f%n", (this.media / this.salario.length));
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }
}
