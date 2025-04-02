package calculadora.model.operacoes;

public class subtrair implements operacao {
    public String nome = "subtrair";

    public Integer calcular(Integer v1, Integer v2) {
        return (v1 - v2);
    }

    public String getNome(){
        return this.nome;
    }
}
