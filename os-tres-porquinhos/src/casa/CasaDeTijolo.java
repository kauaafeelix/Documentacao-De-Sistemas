package casa;

/**
 * @author Kauã Felix da Silva Costa
 * @version 1.0.0
 * <p>A classe <strong>CasaDeTijolo</strong> representa uma casa feita de tijolo</p>
 * @since 2025-11-25
 */

public class CasaDeTijolo implements Casa{

    /**
     * Método para pegar o material que a casa foi construída
     * @return material que a casa foi construida
     */
    @Override
    public String getMaterial() {
        return "Tijolo";
    }

    /**
     * Método boolean para dizer se a casa resiste ao sopro
     * @param forcaDoSopro irá verificar se a casa aguenta a força do <strong>sopro</strong>
     * @return Retorna true se resistir, se nao, false
     */
    @Override
    public boolean resisteAoSopro(int forcaDoSopro) {
        return true;
    }

    /**
     * Método para descrever se a casa está de pé ou destruída
     * @return retorna se o status será <strong>Destruída</strong> ou <strong>De pé</strong>
     */
    @Override
    public String getStatusAtual() {
        return "De pé";
    }
}
