public class ProjetoReciclagem extends ProjetoSustentavel {
    private double toneladasRecicladas;

    public ProjetoReciclagem(){}
    public ProjetoReciclagem(String nome, String descricao, double toneladasRecicladas){
        super(nome, descricao);
        this.toneladasRecicladas = toneladasRecicladas;
    }

    public double getToneladasRecicladas() {
        return toneladasRecicladas;
    }

    public void setToneladasRecicladas(double toneladasRecicladas) {
        this.toneladasRecicladas = toneladasRecicladas;
    }

    @Override
    public void calcularImpacto() {
        System.out.println("Impacto: " + toneladasRecicladas + " toneladas recicladas.");
    }
}
