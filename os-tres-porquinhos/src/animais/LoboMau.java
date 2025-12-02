package animais;

import casa.Casa;

/**
 * @author Kauã Felix da Silva Costa
 * @version 1.0.0
 * <p>A classe <strong>LoboMau</strong> Representa as ações do vilão da história</p>
 * @since 2025-11-25
 */

public class LoboMau {


    /**
     *
     * @param casaAlvo refere-se a casa que será o alvo do sopro do <strong>Lobo</strong>
     * @see Casa#resisteAoSopro(int)
     */
    public void soprar (Casa casaAlvo){
        int forcaDoSopro = getForcaDoSopro();
        boolean casaResiste = casaAlvo.resisteAoSopro(forcaDoSopro);

        if(casaResiste){
            System.out.println("O Lobo soprou com força " + forcaDoSopro + ", mas a casa de " + casaAlvo.getMaterial() + " resistiu!");
        } else {
            System.out.println("O Lobo soprou com força " + forcaDoSopro + " e derrubou a casa de " + casaAlvo.getMaterial() + "!");
        }
    }

    /**
     * Método para definir a força do sopro do Lobo Mau
     * @return retorna a força do sopro
     */
    public int getForcaDoSopro(){
        return 15;
    }
}
