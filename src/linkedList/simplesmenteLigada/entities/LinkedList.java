package linkedList.simplesmenteLigada.entities;

public class LinkedList {
    private Node head;

    // inserir no ínicio da lista
    public void inserir(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void exibirList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
