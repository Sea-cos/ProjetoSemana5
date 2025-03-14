import java.util.ArrayList;

public abstract class ProjetoSustentavel implements ImpactoAmbiental{

    private String nome;
    private String descricao;
    private ArrayList<Voluntario> voluntarios = new ArrayList<>();
    private RelatorioImpacto relatorioImpacto;

    public ProjetoSustentavel(){};
    public ProjetoSustentavel(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

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
        voluntarios.add(voluntario);
    }

    //validar essa
    public String gerarRelatorioImpacto(int arvoresPlantadas, double reducaoCO2) {
        relatorioImpacto = new RelatorioImpacto(arvoresPlantadas, reducaoCO2);
        return relatorioImpacto.exibirRelatorio();
    }
}
