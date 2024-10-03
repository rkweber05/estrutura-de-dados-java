package linkedList.simplesmenteLigada;

import linkedList.simplesmenteLigada.entities.LinkedList;

public class SimplesmenteLigada {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();

        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);

        lista.exibirList();
    }
}
