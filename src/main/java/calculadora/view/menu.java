package calculadora.view;

import calculadora.control.Calculadora;

import java.io.IOException;
import java.util.ArrayList;
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
        
    }
    
}
