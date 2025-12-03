import model.Numero;
import service.NumeroService;
import view.NumeroView;

/**
 *  <p>Classe principal da aplicação de adivinhação de números.</p>
 *  @author Kauã Felix da Silva Costa
 *  @version 1.0.0
 *  @since 2025-12-02
 *
 */
public class Aplicacao {
    /**
     * Método principal que inicia o jogo de adivinhação de números.
     *
     */
    public static void main(String[] args) {

        System.out.println("==== Bem-vindo ao jogo de adivinhação de números! ====");

        Numero numero = new Numero();
        NumeroService numeroService = new NumeroService();
        NumeroView numeroView = new NumeroView();

        boolean acertou = false;

        while (!acertou) {
            int numeroUsuario = numeroView.solicitarNumero();
            String mensagem = numeroService.verificarNumero(numero, numeroUsuario);
            numeroView.exibirMensagem(mensagem);

            if (mensagem.contains("Parabéns")) {
                acertou = true;
                numeroView.exibirMensagem("\nFim de jogo. Obrigado por jogar!");
                break;
            }
        }
    }
}