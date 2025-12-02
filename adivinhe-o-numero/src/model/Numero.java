package model;

public class Numero {

    private int numeroAleatorio;
    private int tentativas;

    public Numero() {
        this.numeroAleatorio = (int) (Math.random() * 100) + 1;
        this.tentativas = 0;
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }
}
