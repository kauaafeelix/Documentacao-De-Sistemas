package view;

import java.util.Scanner;

public class NumeroView {

    Scanner sc = new Scanner(System.in);

    public int solicitarNumero() {
        System.out.print("\nDigite um número entre 1 e 100: ");
        int numeroDigitado = sc.nextInt();

        return numeroDigitado;
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
