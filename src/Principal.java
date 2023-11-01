import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.math.BigDecimal;

public class Principal {
    public static void main(String[] args){


        String descricao = JOptionPane.showInputDialog("Digite a descrição do produto: ");
        String genero = JOptionPane.showInputDialog("Digite o gênero do produto: ");
        BigDecimal precoCusto = new BigDecimal(JOptionPane.showInputDialog("Digite o preço de custo do produto: "));
        BigDecimal margemLucro = new BigDecimal("0.2");

        Produto produto = new Produto(descricao, genero, precoCusto, margemLucro);

        JOptionPane.showMessageDialog(null,produto.obterProduto(),"Produto", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,produto.calcularPrecoVenda(), "Preço de custo acrescido de 20%", JOptionPane.INFORMATION_MESSAGE);

    }
}
