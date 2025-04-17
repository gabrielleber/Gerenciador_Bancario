import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Gerenciador Bancário: ");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Object>> contas = new ArrayList<>();
        boolean continuar = true;
        while (continuar) {
            System.out.println("Menu de opções: \n" +
                    "1 - Cadastrar Conta \n" +
                    "2 - Listar contas \n" +
                    "3 - Sair \n" +
                    "4 - Realizar Depositos \n" +
                    "5 - Realizar Saques \n" +
                    "6 - Consultar Saldo \n" +
                    "7 - Consultar historico de movimentacao \n" +
                    "8 - Transferir Valor entre contas ");


            String operacao = scanner.nextLine();
            if (Objects.equals(operacao, "1")) {
                System.out.println("Digite o nome da conta");
                String nomeConta = scanner.nextLine();
                ArrayList<Object> linha = new ArrayList<>();
                linha.add(nomeConta);
                contas.add(linha);


            }
            if (Objects.equals(operacao, "2")) {
                System.out.println(contas);


            }
            if (Objects.equals(operacao, "4")) {
                System.out.println("Digite o Valor de deposito desejado: ");
                String valorDeposito = scanner.nextLine();
                

            }
            continuar = !Objects.equals(operacao, "3");


        }

    }
}











