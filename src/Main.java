import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> pessoaList = new ArrayList<>();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        int opcao;
        do {
            System.out.println("CADASTRO DE PESSOA");
            System.out.println();
            System.out.println("1. Cadastrar Pesssoa");
            System.out.println("2. Listar pessoa");
            System.out.println("3. Buscar telefone");
            System.out.println("4. Inativar pessoa");
            System.out.println("5. Sair");

            System.out.println("Escolha uma opcao ");
            opcao = sc.nextInt();
            try {
                switch (opcao) {
                    case 1:
                        System.out.println("Digite o nome da pessoa");
                        String nome = sc.next();
                        System.out.println("Digite a data de nascimento, dd/MM/aaaa");
                        String getNascimento = sc.next();
                        LocalDate dataNascimento = LocalDate.parse(getNascimento, fmt);
                        System.out.println("Digite o sexo");
                        String sexo = sc.next();
                        System.out.println("Digite o nome da mãe");
                        String mae = sc.next();
                        System.out.println("Digite o endereço completo");
                        String endereco = sc.next();
                        sc.nextLine();
                        System.out.println("Digite o email");
                        String email = sc.next();
                        System.out.println("Digite o telefone");
                        String telefone = sc.next();
                        System.out.println("digite a url da foto");
                        String foto = sc.next();
                        Pessoa pessoa = new Pessoa(nome, dataNascimento, sexo, mae, endereco, email, telefone, foto);

                        if (pessoa != null) {
                            pessoaList.add(pessoa);
                            System.out.println("Pessoa " + pessoa.getPes_nome() + " cadastrada com sucesso!");
                        } else {
                            System.out.println("Não foi possivel cadastrar! Verifique os dados!");
                        }
                        break;
                    case 2:
                        pessoaList.forEach(System.out::println);
                        break;
                    case 3:
                        System.out.println("Digite o telefone da pessoa que deseja encontrar ");
                        String buscaTelefone = sc.next();
                        System.out.println("listando..");
                        pessoaList.stream().
                                filter(e -> e.getTelefone().equalsIgnoreCase(buscaTelefone))
                                .forEach(System.out::println);
                        break;
                    case 4:
                        System.out.println("Digite o nome da pessoa para inativar ");
                        String buscaNome = sc.next();

                        for (Pessoa p : pessoaList) {
                            if ( buscaNome.equalsIgnoreCase(p.getPes_nome())) {
                                p.inativarCliente();
                                System.out.println("Cliente encontrado! " + p.getPes_nome() + " foi inativado! ");
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        break;
                }
            }catch (InputMismatchException e) {
                System.out.println("Error " + e.getMessage() + " Verifique a entrada de dados! ");
            }
        } while (opcao != 5);
    }
}
