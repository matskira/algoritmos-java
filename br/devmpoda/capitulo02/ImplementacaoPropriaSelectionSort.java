package br.devmpoda.capitulo02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImplementacaoPropriaSelectionSort {

    public static int menorValor(List<Integer> list){
        int minimoIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < list.get(minimoIndex)){
                minimoIndex = i;
            }
        }
        return minimoIndex;
    }

    public static List<Integer> selectionSort(List<Integer> list){
        List<Integer> newList = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int menorIndex = menorValor(list);
            newList.add(list.get(menorIndex));
            list.remove(menorIndex);
        }
        return newList;
    }

    //selection sort usando vetor
    public static int[] selectionSort2(int[] target) {
        for (int i = 0; i < target.length - 1; i++) {
            int left = target[i];
            for (int j = i + 1; j < target.length; j++) {
                int right = target[j];
                if (left > right) {
                    target[i] = right;
                    target[j] = left;
                    left = right;
                }
            }
        }
        return target;
    }

    public static void main(String[] args) {
        int[] lista = {7,5,1,8,3};
        for (int i: selectionSort2(lista)) {
            System.out.println(i);
        }

    }

}
