package aula03;

public class Programa {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        System.out.println(lista.getTamanho());
        lista.adicionar("BA");
        lista.adicionar("AL");
        lista.adicionar("PR");
        lista.adicionar("MG");
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Último: " + lista.getUltimo().getValor());
        System.out.println(lista.get(0).getValor());
        System.out.println(lista.get(1).getValor());
        System.out.println(lista.get(2).getValor());
        System.out.println(lista.get(3).getValor());

    }
}
