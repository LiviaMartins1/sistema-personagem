public class Guerreiro extends Personagem{
    private double força;

    public Guerreiro(String nome, int nivel, double qtdVida, double força) {
        super(nome, nivel, qtdVida);
        this.força = força;
    }

    public double getForça() {
        return força;
    }

    public void setForça(double força) {
        this.força = força;
    }
    @Override
    public void atacar(){
        IO.println("O gurreiro atacou com sua espada!");
    }
    @Override
    public String toString(){
        return super.toString() +
                "Força: " + força;
    }
}
