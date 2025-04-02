package calculadora.model.operacoes;

public interface operacao {
    public String nome = "operacao";

    public Integer calcular(Integer v1, Integer v2);

    public String getNome();
}
