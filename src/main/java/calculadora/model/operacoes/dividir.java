package calculadora.model.operacoes;

public class dividir implements operacao {
    public String nome = "dividir";

    public Integer calcular(Integer v1, Integer v2) {
        return (v1 / v2);
    }

    public String getNome(){
        return this.nome;
    }
}
