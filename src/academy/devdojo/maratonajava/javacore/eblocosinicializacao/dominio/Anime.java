package academy.devdojo.maratonajava.javacore.eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    //1 - alocado espaço em memoria pro objeto
    //2 - cada atrinbuto de classe é criado e inicialiazado com valores default ou o que for passada
    //3 - Bloco de  inicialização é executado
    //4 - Construtor é executado
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int espisodio : this.episodios) {
            System.out.print(espisodio + " ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
