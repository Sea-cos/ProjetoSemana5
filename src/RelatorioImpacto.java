public class RelatorioImpacto {

    private int arvoresPlantadas;
    private double reducaoCO2;
    private double energia;
    private int lixoColetado;

    public RelatorioImpacto(){}

    public RelatorioImpacto(int arvoresPlantadas, double reducaoCO2, double energia, int lixoColetado){
        this.arvoresPlantadas = arvoresPlantadas;
        this.reducaoCO2 = reducaoCO2;
        this.energia = energia;
        this.lixoColetado = lixoColetado;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public int getLixoColetado() {
        return lixoColetado;
    }

    public void setLixoColetado(int lixoColetado) {
        this.lixoColetado = lixoColetado;
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
        return  arvoresPlantadas + " árvores plantadas, "
                + reducaoCO2 + " toneladas de CO2 reduzidas,"
                + lixoColetado + " toneladas de lixo coletado e "
                + energia + " MWh de energia gerada ";
    }
}
