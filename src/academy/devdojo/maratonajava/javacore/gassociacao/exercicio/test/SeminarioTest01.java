package academy.devdojo.maratonajava.javacore.gassociacao.exercicio.test;

import academy.devdojo.maratonajava.javacore.gassociacao.exercicio.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.gassociacao.exercicio.dominio.Local;
import academy.devdojo.maratonajava.javacore.gassociacao.exercicio.dominio.Professor;
import academy.devdojo.maratonajava.javacore.gassociacao.exercicio.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local1 = new Local("ExpoMinas");
        Local local2 = new Local("Teatro Municipal");
        Local local3 = new Local("Sala de apresentações");

        Seminario seminario1 = new Seminario("Dostoievski", local1);
        Seminario seminario2 = new Seminario("Java, oportunidades", local3);
        Seminario seminario3 = new Seminario("O Amor", local2);

        Seminario[] seminariosProf1 = {seminario1};
        Seminario[] seminariosProf2 = {seminario3};
        Seminario[] seminariosProf3 = {seminario2};

        Professor professor1 = new Professor("Paulo Roberto", "Letras/Literatura", seminariosProf1);
        Professor professor2 = new Professor("Juan Amado", "Arte conteporânea", seminariosProf2);
        Professor professor3 = new Professor("Nélio", "Proigramação/Java", seminariosProf3);

        seminario1.setProfessor(professor1);
        seminario2.setProfessor(professor3);
        seminario3.setProfessor(professor2);

        Estudante estudante1 = new Estudante("Pedro", 22, seminario1);
        Estudante estudante2 = new Estudante("João Pedro", 20, seminario1);
        Estudante estudante3 = new Estudante("João Victor", 25, seminario1);
        Estudante estudante4 = new Estudante("Astrid", 18, seminario1);

        Estudante estudante5 = new Estudante("Isabela", 19, seminario2);
        Estudante estudante6 = new Estudante("Sendrick", 20, seminario2);
        Estudante estudante7 = new Estudante("Bill", 23, seminario2);
        Estudante estudante8 = new Estudante("Aurora", 17, seminario2);

        Estudante estudante9 = new Estudante("Lucas", 19, seminario3);
        Estudante estudante10 = new Estudante("Ariel", 27, seminario3);
        Estudante estudante11 = new Estudante("Emilia", 25, seminario3);
        Estudante estudante12 = new Estudante("Gabriel", 23, seminario3);

        Estudante[] alunosLiteratura = {estudante1, estudante2, estudante3, estudante4};
        Estudante[] alunosProgramacao = {estudante5, estudante6, estudante7, estudante8};
        Estudante[] alunosArtes = {estudante9, estudante10, estudante11, estudante12};

        seminario1.setAlunos(alunosLiteratura);
        seminario2.setAlunos(alunosProgramacao);
        seminario3.setAlunos(alunosArtes);
        seminario1.imprime();
        seminario2.imprime();
        seminario3.imprime();

    }
}
