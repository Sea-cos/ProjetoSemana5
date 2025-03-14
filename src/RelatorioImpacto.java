public class RelatorioImpacto {

    private int arvoresPlantadas;
    private double reducaoCO2;

    public RelatorioImpacto(){}
    public RelatorioImpacto(int arvoresPlantadas, double reducaoCO2){
        this.arvoresPlantadas = arvoresPlantadas;
        this.reducaoCO2 = reducaoCO2;
    }

    public int getArvoresPlantadas() {
        return arvoresPlantadas;
    }

    public void setArvoresPlantadas(int arvoresPlantadas) {
        this.arvoresPlantadas = arvoresPlantadas;
    }

    public double getReducaoCO2() {
        return reducaoCO2;
    }

    public void setReducaoCO2(double reducaoCO2) {
        this.reducaoCO2 = reducaoCO2;
    }

    public String exibirRelatorio() {
        return "Relatório de Impacto: " + arvoresPlantadas + " árvores plantadas e "
                + reducaoCO2 + " toneladas de CO2 reduzidas.";
    }
}
