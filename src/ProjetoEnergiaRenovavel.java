public class ProjetoEnergiaRenovavel extends ProjetoSustentavel{
    private double energiaGerada;

    public ProjetoEnergiaRenovavel(String nome, String descricao, double energiaGerada){
        super(nome, descricao);
        this.energiaGerada = energiaGerada;
    }

    @Override
    public void calcularImpacto() {
        System.out.println("Impacto: " + energiaGerada + " MWh de energia gerada.");
    }
}
