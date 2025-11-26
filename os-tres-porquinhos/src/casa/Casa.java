package casa;

/**
 * @author Kauã Felix da Silva Costa
 * @version 1.0.0
 * <p><strong>Interface Casa</strong> Representa o conceito geral de uma casa.Casa</p>
 * @since 2025-11-25
 */

public interface Casa {

    /**
     * Método para pegar o material que a casa foi construída
     * @return material que a casa foi construida
     */
    public String getMaterial();

    /**
     * Método boolean para dizer se a casa resiste ao sopro
     * @param forcaDoSopro irá verificar se a casa aguenta a força do <strong>sopro</strong>
     * @return Retorna true se resistir, se nao, false
     */
    public boolean resisteAoSopro (int forcaDoSopro);


    /**
     * Método para descrever se a casa está de pé ou destruída
     * @return retorna se o status será <strong>Destruída</strong> ou <strong>De pé</strong>
     */
    public String getStatusAtual();
}
