package animais;

import casa.Casa;

/**
 * @author Kauã Felix da Silva Costa
 * @version 1.0.0
 * <p>A classe <strong>Porquinho</strong> Representa as ações do personagem principal da história</p>
 * @since 2025-11-25
 */

public class Porquinho {

    /**
     *
     * @param tipoCasa refere-se ao tipo de casa que o <strong>Porquinho</strong> irá construir
     */
    public void construirCasa(Casa tipoCasa){
        System.out.println("O porquinho está construindo uma casa de " + tipoCasa.getMaterial() + ".");
    }

    /**
     *
     * @param porquinhoAlvo refere-se ao porquinho que está fugindo do <strong>Lobo Mau</strong>
     */
    public void fugirDoLobo(Porquinho porquinhoAlvo){
        System.out.println("O porquinho está fugindo do Lobo Mau!");
    }

    /**
     * Método para pegar o nome do porquinho
     * @return nome do porquinho
     */
    public String getNome(){
        return "Cícero";
    }
}
