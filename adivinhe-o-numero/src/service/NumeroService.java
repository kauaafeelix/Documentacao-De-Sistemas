package service;

import model.Numero;

public class NumeroService {

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
