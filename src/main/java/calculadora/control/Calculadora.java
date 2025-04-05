package calculadora.control;

import java.util.ArrayList;
import java.util.List;

import calculadora.model.operacoes.operacao;
import calculadora.model.operacoes.somar;
import calculadora.model.operacoes.subtrair;
import calculadora.model.operacoes.multiplicar;
import calculadora.model.operacoes.dividir;

public class Calculadora {
    private ArrayList<operacao> ops = new ArrayList<operacao>();

    public Calculadora() {
        somar so = new somar();
        this.ops.add(so);
        subtrair su = new subtrair();
        this.ops.add(su);
        multiplicar mu = new multiplicar();
        this.ops.add(mu);
        dividir di = new dividir();
        this.ops.add(di);
    }

    public Integer operar(Integer id, Integer A, Integer B) {
        operacao o;
        Integer resultado = 0;

        o = this.ops.get(id);
        resultado = o.calcular(A, B);

        return resultado;
    }

    public List<String> getOperacoesNomesToString() {
        List<String> nomes = new ArrayList<String>();
        operacao o;

        for (Integer i = 0; i < this.ops.size(); i++) {
            o = this.ops.get(i);
            nomes.add(o.getNome());
        }

        return nomes;
    }
}
