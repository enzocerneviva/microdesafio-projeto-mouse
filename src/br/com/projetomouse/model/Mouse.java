package br.com.projetomouse.model;

public class Mouse {
    public long dPI;
    public String cor;
    public double pesoEmGramas;
    public double xAtual = 0;
    public double yAtual = 0;
    public int pixelsPorScroll = 100;

    public void deslocarPonteiro (final double x, final double y) {
        System.out.println("\nDeslocando ponteiro...");

        System.out.println("\nCoordenada anterior: (" + this.xAtual + ", " + this.yAtual + ")");

        double distanciaDeslocada = Math.sqrt(Math.pow((y - this.yAtual), 2) + Math.pow((x - this.xAtual), 2));
        double centimetrosDeslocados = (distanciaDeslocada / this.dPI) * 2.54; // 2.54 equivale a quantidade de centím. de uma polegada.
        this.xAtual = x;
        this.yAtual = y;

        System.out.println("Coordenada atual: (" + x + ", " + y + ")");
        System.out.println("Distância deslocada em pixels: " + distanciaDeslocada);
        System.out.println("Deslocamento do mouse em cm: " + centimetrosDeslocados);

        System.out.println(" ");
    }

    public void scrollar (int passosScroll) {

        System.out.println("\nVerificando deslocamento com scroll...\n");

        int deslocamentoEmPixelsScroll = passosScroll * this.pixelsPorScroll;

        if (passosScroll > 0) {
            System.out.println("Deslocamento de " + deslocamentoEmPixelsScroll + " para cima!");
        } else if (passosScroll < 0) {
            System.out.println("Deslocamento de " + (-1 * deslocamentoEmPixelsScroll) + " para baixo!");
        } else {
            System.out.println("Não houve deslocamento utilizando o scroll do mouse!");
        }

        System.out.println(" ");

    }

}
