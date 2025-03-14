import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escolha o tipo de organização (1 para ONG, 2 para Empresa):");
        int tipoOrganizacao = scanner.nextInt();
        scanner.nextLine();

        Organizacao organizacao = null;
        if (tipoOrganizacao == 1) {
            System.out.print("Digite o nome da ONG: ");
            String nomeONG = scanner.nextLine();
            organizacao = new ONG(nomeONG);
        } else if (tipoOrganizacao == 2) {
            System.out.print("Digite o nome da Empresa: ");
            String nomeEmpresa = scanner.nextLine();
            System.out.print("Digite o CNPJ da Empresa: ");
            String cnpj = scanner.nextLine();
            organizacao = new Empresa(nomeEmpresa, cnpj);
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        // Criar projetos sustentáveis
        System.out.println("\nEscolha um tipo de projeto:");
        System.out.println("1 - Reflorestamento");
        System.out.println("2 - Reciclagem");
        System.out.println("3 - Energia Renovável");
        int tipoProjeto = scanner.nextInt();
        scanner.nextLine();

        ProjetoSustentavel projeto = null;
        switch (tipoProjeto) {
            case 1:
                projeto = new ProjetoReflorestamento("Reflorestamento da Amazônia", "Reflorestamento em áreas críticas", 1000);
                break;
            case 2:
                projeto = new ProjetoReciclagem("Reciclagem Urbana", "Reciclagem de plásticos", 500.0);
                break;
            case 3:
                projeto = new ProjetoEnergiaRenovavel("Energia Solar", "Geração de energia solar", 2500.0);
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }


        System.out.print("\nDigite o nome do voluntário: ");
        String nomeVoluntario = scanner.nextLine();
        System.out.print("Digite o email do voluntário: ");
        String emailVoluntario = scanner.nextLine();

        Voluntario voluntario = new Voluntario(nomeVoluntario, emailVoluntario);


        voluntario.participarProjeto(projeto);
        projeto.adicionarVoluntario(voluntario);


        organizacao.adicionarProjeto(projeto);


        boolean sair = false;
        while (!sair) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Listar Projetos da Organização");
            System.out.println("2 - Gerar Relatório de Impacto do Projeto");
            System.out.println("3 - Calcular Impacto Ambiental");
            System.out.println("4 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nProjetos da organização " + organizacao.getNome() + ":");
                    System.out.println(organizacao.listarProjetos());
                    break;
                case 2:
                    String relatorio = projeto.gerarRelatorioImpacto(1000, 200.5);
                    System.out.println("Relatório de Impacto: " + relatorio);
                    break;
                case 3:
                    projeto.calcularImpacto();
                    break;
                case 4:
                    sair = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
