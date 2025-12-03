package view;

import java.util.Scanner;
/**
 *
 *
 *  @author Kauã Felix da Silva Costa
 *  @version 1.0.0
 *  <p>A classe <strong>LoboMau</strong> Representa as ações do vilão da história</p>
 *  @since 2025-12-02
 *
 * Classe responsável pela interação com o usuário.
 */

public class NumeroView {

    Scanner sc = new Scanner(System.in);

    /**
     * Solicita ao usuário que digite um número entre 1 e 100.
     *
     * @return O número digitado pelo usuário.
     */

    public int solicitarNumero() {
        System.out.print("\nDigite um número entre 1 e 100: ");
        int numeroDigitado = sc.nextInt();

        return numeroDigitado;
    }

    /**
     * Exibe uma mensagem para o usuário.
     *
     * @param mensagem A mensagem a ser exibida.
     */
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
