package enums;

public enum ClassePersonagem {

    MAGO(2, "Mago"),
    ARQUEIRO(3, "Arqueiro");
    GUERREIRO(1, "Guerreiro"),
    
    

    private final int codigo;
    private final String nomeExibicao;

    ClassePersonagem(int codigo, String nomeExibicao) {
        this.codigo = codigo;
        this.nomeExibicao = nomeExibicao;
    }

    public String getNomeExibicao() {
        return nomeExibicao;
    }
}