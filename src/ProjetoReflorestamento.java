public class ProjetoReflorestamento extends ProjetoSustentavel {
    private int arvoresPlantadas;

    public ProjetoReflorestamento(){}
    public ProjetoReflorestamento(String nome, String descricao, int arvoresPlantadas){
        super(nome, descricao);
        this.arvoresPlantadas = arvoresPlantadas;
    }

    public int getArvoresPlantadas() {
        return arvoresPlantadas;
    }

    public void setArvoresPlantadas(int arvoresPlantadas) {
        this.arvoresPlantadas = arvoresPlantadas;
    }

    @Override
    public void calcularImpacto(){
        System.out.println("Impacto: " + arvoresPlantadas + " arvores plantadas.");
    }

}
