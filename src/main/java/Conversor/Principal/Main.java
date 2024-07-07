package Conversor.Principal;

import Conversor.service.ConverterMoeda;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    private static final Scanner leitura = new Scanner(System.in);

    public static void main(String[] args) throws IOException, InterruptedException {
        exibeMenu();
    }

    public static void exibeMenu() throws IOException, InterruptedException {
        var opcao = -1;
        while (opcao != 0) {
            var menu = """
                    ***************************************************************
                    Seja bem-vindo(a) ao conversode moedas!
                    
                    1) Dolar => Real
                    2) Real => Dolar
                    3) Euro => Real
                    4) Real => Euro
                    5) Dolar => Euro
                    6) Euro => Dolar
                    7) Libra Esterlina => Real
                    8) Real => Libra Esterlina
                    9) Yuan Chines => Real
                    10) Real => Yuan Chines
                    0 - Sair do conversor
                    
                    Selecione uma opção de converção de moeda dispinível!
                    ***************************************************************
                    """;
           
            System.out.println(menu);
            System.out.println("Digite uma opção valida:");
            opcao = leitura.nextInt();
            leitura.nextLine();
            System.out.println("");

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            System.out.println("Digite o valor a ser convertido:");
            double valor = leitura.nextDouble();
            leitura.nextLine();

            switch (opcao) {
                case 1 -> ConverterMoeda.converterMoeda("USD", "BRL", valor);
                case 2 -> ConverterMoeda.converterMoeda("BRL", "USD", valor);
                case 3 -> ConverterMoeda.converterMoeda("EUR", "BRL", valor);
                case 4 -> ConverterMoeda.converterMoeda("BRL", "EUR", valor);
                case 5 -> ConverterMoeda.converterMoeda("USD", "EUR", valor);
                case 6 -> ConverterMoeda.converterMoeda("EUR", "USD", valor);
                case 7 -> ConverterMoeda.converterMoeda("GBP", "BRL", valor);
                case 8 -> ConverterMoeda.converterMoeda("BRL", "GBP", valor);
                case 9 -> ConverterMoeda.converterMoeda("CNY", "BRL", valor);
                case 10 -> ConverterMoeda.converterMoeda("BRL", "CNY", valor);
                default -> System.out.println("Opção inválida!");
            }
        }
    } 
}

