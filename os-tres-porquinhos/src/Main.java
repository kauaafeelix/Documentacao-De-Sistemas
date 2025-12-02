//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import animais.LoboMau;
import animais.Porquinho;
import casa.Casa;
import casa.CasaDeMadeira;
import casa.CasaDePalha;
import casa.CasaDeTijolo;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bem-vindo à história dos Três Porquinhos!");

        Porquinho porquinho1 = new Porquinho();
        Porquinho porquinho2 = new Porquinho();
        Porquinho porquinho3 = new Porquinho();

        Casa casaPalha = new CasaDePalha();
        Casa casaMadeira = new CasaDeMadeira();
        Casa casaTijolo = new CasaDeTijolo();

        porquinho1.construirCasa(casaPalha);
        porquinho2.construirCasa(casaMadeira);
        porquinho3.construirCasa(casaTijolo);

        System.out.println();

        LoboMau lobo = new LoboMau();

        lobo.soprar(casaPalha);
        System.out.println("Status da casa de " + casaPalha.getMaterial() + ": " + casaPalha.getStatusAtual());
        System.out.println();

        lobo.soprar(casaMadeira);
        System.out.println("Status da casa de " + casaMadeira.getMaterial() + ": " + casaMadeira.getStatusAtual());
        System.out.println();

        lobo.soprar(casaTijolo);
        System.out.println("Status da casa de " + casaTijolo.getMaterial() + ": " + casaTijolo.getStatusAtual());
    }
}
