import java.util.ArrayList;

public class ProjetoSustentavel {

    private String nome;
    private String descricao;
    private ArrayList<Voluntario> voluntarios;
    private RelatorioImpacto relatorioImpacto;

    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(ArrayList<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }

    public RelatorioImpacto getRelatorioImpacto() {
        return relatorioImpacto;
    }

    public void setRelatorioImpacto(RelatorioImpacto relatorioImpacto) {
        this.relatorioImpacto = relatorioImpacto;
    }


    //metodos
    public void adicionarVoluntario(Voluntario voluntario){

    }

    public String gerarRelatorioImpacto (int arvoresPlantadas, double reducaoCO2){
        return "";
    }
}
