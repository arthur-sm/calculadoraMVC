package calculadora.view;

import calculadora.control.Calculadora;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class menu {
    Calculadora c = new Calculadora();

    public void mostrarMenu() {
        List<String> opcoes = new ArrayList<String>();
        opcoes = c.getOperacoesNomesToString();
        String o;

        System.out.println("");
        System.out.print("Digite o ID da operação desejada:\n");
        for (Integer i = 0; i < opcoes.size(); i++) {
            o = opcoes.get(i);
            System.out.println("{" + i.toString() + "} - " + o);
        }
        System.out.println("{Qualquer outro número} - Sair");
    }

    public void recebeEntrada() {
        int e, v1, v2;
        e = -1;
        Scanner userinput = new Scanner(System.in);
        String resultado = "";

        System.out.println("");
        while (!resultado.equals("Sair")) {
            System.out.println("Insira operação desejada: ");

            try {
                e = userinput.nextInt();

                if (e >= 0 && e < c.getOperacoesNomesToString().size()) {
                    System.out.println("Insira os valores a serem calculados, em ordem: ");
                    v1 = userinput.nextInt();
                    v2 = userinput.nextInt();

                    resultado = this.c.operar(e, v1, v2).toString();
                } else {
                    resultado = "Sair";
                }

                System.out.printf("Resultado: %s\n", resultado);
            } catch (InputMismatchException erro) {
                System.err.println("Erro entre cadeira e monitor - Entrada deve ser número inteiro.\n");
                resultado = "Sair";
            }
        }

        userinput.close();
    }
}
