import java.util.ArrayList;

public class Organizacao {

    private String nome;
    private ArrayList<ProjetoSustentavel> listaProjetos = new ArrayList<>();

    public Organizacao(){};
    public Organizacao(String nome) {
        this.nome = nome;
    }
    public Organizacao(String nome, ArrayList<ProjetoSustentavel> listaProjetos) {
        this.nome = nome;
        this.listaProjetos = listaProjetos;
    }

    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<ProjetoSustentavel> getListaProjetos() {
        return listaProjetos;
    }

    public void setListaProjetos(ArrayList listaProjetos) {
        this.listaProjetos = listaProjetos;
    }

    //metodos
    public void adicionarProjeto(ProjetoSustentavel projeto){
        listaProjetos.add(projeto);
    }

    public String listarProjetos() {
        StringBuilder projetos = new StringBuilder();
        for (ProjetoSustentavel projeto : listaProjetos) {
            projetos.append(projeto.getNome()).append("\n");
        }
        return projetos.toString();
    }


}
