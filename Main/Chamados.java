
import java.util.ArrayList;
import java.util.Scanner;

public class Chamados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Chamado> chamados = new ArrayList<>();

        int opcao = 0;
        int idChamado = 1;

        do {
            System.out.println("\n==== HELP DESK ====");
            System.out.println("1 - Abrir chamado");
            System.out.println("2 - Listar chamados");
            System.out.println("3 - Buscar chamado");
            System.out.println("4 - Remover chamado");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            // Validação do menu
            if (!entrada.hasNextInt()) {
                System.out.println("Digite um número válido!");
                entrada.nextLine();
                continue;
            }

            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {
                System.out.println("\nAbrindo chamado...");

                String descricao;

                do {
                    System.out.print(
                        "Digite a descrição do seu problema: "
                    );
                    descricao = entrada.nextLine();

                    if (descricao.isBlank()) {
                        System.out.println(
                            "A descrição não pode ser vazia!"
                        );
                    }
                } while (descricao.isBlank());

                int escolha;

                do {
                    System.out.println("\nEscolha a prioridade:");
                    System.out.println("1 - Baixa");
                    System.out.println("2 - Média");
                    System.out.println("3 - Alta");

                    System.out.print("Digite a opção: ");

                    // Validação da entrada da prioridade
                    while (!entrada.hasNextInt()) {
                        System.out.println(
                            "Digite apenas um número!"
                        );
                        entrada.nextLine();
                        System.out.print("Digite a opção: ");
                    }

                    escolha = entrada.nextInt();
                    entrada.nextLine();

                    if (escolha < 1 || escolha > 3) {
                        System.out.println(
                            "Prioridade inválida! Escolha 1, 2 ou 3."
                        );
                    }
                } while (escolha < 1 || escolha > 3);

                String prioridade;

                switch (escolha) {
                    case 1:
                        prioridade = "Baixa";
                        break;
                    case 2:
                        prioridade = "Média";
                        break;
                    default:
                        prioridade = "Alta";
                        break;
                }

                Chamado chamado = new Chamado(
                    idChamado++, descricao, prioridade, "Aberto"
                );

                chamados.add(chamado);

                System.out.println(
                    "Chamado aberto com sucesso!"
                );
                System.out.println("ID do chamado: " + chamado.getId());

            } else if (opcao == 2) {

                if (chamados.isEmpty()) {
                    System.out.println(
                        "Nenhum chamado cadastrado!"
                    );
                } else {
                    System.out.println("\n=== LISTA DE CHAMADOS ===");

                    for (Chamado chamado : chamados) {
                        System.out.println(chamado);
                    }
                }

            } else if (opcao == 3) {

                if (chamados.isEmpty()) {
                    System.out.println(
                        "Nenhum chamado cadastrado!"
                    );
                } else {
                    System.out.print(
                        "Digite o ID do chamado: "
                    );

                    while (!entrada.hasNextInt()) {
                        System.out.println("Digite um ID numérico!");
                        entrada.nextLine();
                        System.out.print("Digite o ID do chamado: ");
                    }

                    int id = entrada.nextInt();
                    entrada.nextLine();

                    boolean encontrado = false;

                    for (Chamado chamado : chamados) {
                        if (id == chamado.getId()) {
                            encontrado = true;
                            System.out.println(chamado);
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println(
                            "Chamado não encontrado!"
                        );
                    }
                }

            } else if (opcao == 4) {

                if (chamados.isEmpty()) {
                    System.out.println(
                        "Não há chamados cadastrados para remover!"
                    );
                } else {
                    System.out.print(
                        "Digite o ID que deseja remover: "
                    );

                    while (!entrada.hasNextInt()) {
                        System.out.println("Digite um ID numérico!");
                        entrada.nextLine();
                        System.out.print(
                            "Digite o ID que deseja remover: "
                        );
                    }

                    int id = entrada.nextInt();
                    entrada.nextLine();

                    Chamado chamadoRemover = null;

                    for (Chamado chamado : chamados) {
                        if (id == chamado.getId()) {
                            chamadoRemover = chamado;
                            break;
                        }
                    }

                    if (chamadoRemover == null) {
                        System.out.println(
                            "Chamado não encontrado!"
                        );
                    } else {
                        chamados.remove(chamadoRemover);
                        System.out.println(
                            "Chamado removido com sucesso!"
                        );
                    }
                }

            } else if (opcao == 5) {
                System.out.println("Sistema encerrado!");

            } else {
                System.out.println(
                    "Opção inválida! Escolha de 1 a 5."
                );
            }

        } while (opcao != 5);

        entrada.close();
    }
}
