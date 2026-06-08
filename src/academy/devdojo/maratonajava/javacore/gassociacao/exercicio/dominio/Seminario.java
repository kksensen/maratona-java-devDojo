package academy.devdojo.maratonajava.javacore.gassociacao.exercicio.dominio;

public class Seminario {
    private String titulo;
    private Estudante[] alunos;
    private Local local;
    private Professor professor;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Estudante[] alunos) {
        this(titulo, local);
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("\n----------==\\=/==----------");
        System.out.println("Título: " + this.titulo);
        System.out.println("Local: " + this.local.getEndereco());
        System.out.printf("Professor responsável: %s, %s\n",this.professor.getNome(), this.professor.getEspecialidade());
        if (this.alunos == null) {
            return;
        } else {
            System.out.print("Alunos do seminário: ");
            for (Estudante aluno : this.alunos) {
                System.out.printf("\n   %s, %d anos",aluno.getNome(),aluno.getIdade());
            }
        }

    }


    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudante[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Estudante[] alunos) {
        this.alunos = alunos;
    }
}
