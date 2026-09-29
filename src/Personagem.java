public abstract class Personagem  {
    private String nome;
    private int nivel;
    private double qtdVida;

    public Personagem(String nome, int nivel, double qtdVida) {
        this.nome = nome;
        setNivel(nivel);
        setQtdVida(qtdVida);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQtdVida() {
        return qtdVida;
    }

    public void setQtdVida(double qtdVida) {
        if (qtdVida < 0) {
            this.qtdVida = 0;
        } else if (qtdVida > 100) {
            this.qtdVida = 100;
        } else {
            this.qtdVida = qtdVida;
        }
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel < 1) {
            this.nivel = 1;
        } else {
            this.nivel = nivel;
        }
    }
    public void atacar(){
        IO.println("O personagem realizou um ataque");
    }
    @Override
    public String toString(){
        return "nome" + nome +
                "Nível: " + nivel +
                "Vida: " + qtdVida;
    }

}



