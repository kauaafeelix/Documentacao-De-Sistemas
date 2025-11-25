package com.aula;

/**
 *
 * Representa o carrinho com produtos escolhidos pelo cliente
 */

public class Carrinho {

    /**
     * Calcula o total com base na nos produtos e sua quantidade
     * @param produto produto a ser adicionado
     * @param quantidade quantidade dos produtos
     * @return retorna o valor total da compra
     * @see Produto#aplicarDesconto(double)
     */
    public double calcularTotal(Produto produto, int quantidade){
        return produto.aplicarDesconto(0) * quantidade;
    }


}
