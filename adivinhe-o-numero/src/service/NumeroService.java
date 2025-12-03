package service;

import model.Numero;

/**
 * <p>Classe responsável pela lógica do jogo de adivinhação de números.</p>
 * @author Kauã Felix da Silva Costa
 * @version 1.0.0
 * @since 2025-12-02
 *
 */

public class NumeroService {

    /**
     * Verifica o número digitado pelo usuário em relação ao número aleatório.
     * @param numeroModel numero aleatório que será comparado a entrada do usuário
     * @param numeroUsuario numero digitado pelo usuário
     * @return mensagem indicando se o número digitado pelo usuário é maior, menor ou igual ao número gerado aleatoriamente
     */
    public String verificarNumero(Numero numeroModel, int numeroUsuario) {
        numeroModel.setTentativas(numeroModel.getTentativas() + 1);

        if (numeroUsuario < numeroModel.getNumeroAleatorio()) {
            return "\nO número é maior!";
        } else if (numeroUsuario > numeroModel.getNumeroAleatorio()) {
            return "\nO número é menor!";
        } else {
            return "\nParabéns! Você acertou em " + numeroModel.getTentativas() + " tentativas.";
        }
    }
}
