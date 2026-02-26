package br.com.projetomouse.main;

import br.com.projetomouse.model.Mouse;

public class Main {
    public static void main(String[] args) {


        System.out.println("-----------------------------------------");
        System.out.println("------ Inicializando Projeto Mouse ------");
        System.out.println("-----------------------------------------");

        Mouse mouse1 = new Mouse();

        mouse1.dPI = 800;
        mouse1.cor = "Vermelho";
        mouse1.pesoEmGramas = 100;

        mouse1.deslocarPonteiro(720, 480);
        mouse1.deslocarPonteiro(200, 400);

        mouse1.scrollar(2);
        mouse1.scrollar(-3);
        mouse1.scrollar(0);
    }
}
