import java.math.BigDecimal;

public class Produto {
    // Atributos

    private String descricao;
    private String genero;

    private BigDecimal precoCusto;
    private BigDecimal margemLucro;

    public Produto(String descricao, String genero, BigDecimal precoCusto, BigDecimal margemLucro) {
        this.descricao = descricao;
        this.genero = genero;
        this.precoCusto = precoCusto;
        this.margemLucro = margemLucro;
    }

    // Método de acesso
    // Leitura
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public BigDecimal getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(BigDecimal precoCusto) {
        this.precoCusto = precoCusto;
    }

    public BigDecimal getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(BigDecimal margemLucro) {
        this.margemLucro = margemLucro;
    }

    // Método
    public String obterProduto() {
        return String.format("Descrição: %s\nGênero: %s\nPreço de venda: R$ %s", this.getDescricao(), this.getGenero(), this.calcularPrecoVenda());

    }

    public BigDecimal calcularPrecoVenda() {
        BigDecimal precoVenda = this.precoCusto.add(this.precoCusto.multiply(this.margemLucro));
        return precoVenda;
    }
}
