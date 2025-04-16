import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Gerenciador Bancário: ");
        System.out.println();


        //Funciionalidade de Cadastro//

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaContas = new ArrayList<>();
        Boolean cadastrarNovo = true;

        while (cadastrarNovo) {
            System.out.println("Digite Nome e número de conta a serem cadastrados: ");
            String nomes = scanner.nextLine();
            listaContas.add(nomes);


            System.out.println("Deseja Cadastrar novo Nome e numero de conta? (True/False)");
            cadastrarNovo = scanner.nextBoolean();
            scanner.nextLine();

        }

        System.out.println("Nomes e numeros de contas já cadastrados: ");
        for (String nomes : listaContas) {
            System.out.println(nomes);
        }

        scanner.close();

        // término da Funcionalidade Cadastro//


        //Funcionalidade Depósito//

        Scanner scanner1 = new Scanner(System.in);
        ArrayList<String> listaDeposito = new ArrayList<>();

        }
    }





