public class Mago extends Personagem {
    private double mana;

    public Mago(String nome, int nivel, double qtdVida, double mana) {
        super(nome, nivel, qtdVida);
        this.mana = mana;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }
    @Override
    public void atacar(){
        IO.println("O mago lançou um fetiço!");
    }
    @Override
    public String toString(){
        return super.toString() +
                "Mana" + mana;

    }

}
