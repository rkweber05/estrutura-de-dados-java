package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4}; // criado o array com 4 elementos

        System.out.println(array[2]); // imprime o 3 elemento, pois começa a partir do índice 0

        // criado uma lista, onde passo 4 elementos e adiciono o 5 através de um método
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        arrayList.add(5); // adicionado método .add para adicionar mais um elemento

        System.out.println(arrayList); // imprime uma nova lista com os 5 elementos
    }
}