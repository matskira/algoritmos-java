package br.devmpoda.capitulo02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    /*
        Versão 1
     */

    private static List<Integer> selectionSort(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>(arr.size());

        int size = arr.size();
        for (int i = 0; i < size; i++) {
            int smallest = findSmallest(arr);
            newArr.add(arr.get(smallest));

            arr.remove(smallest);
        }

        return newArr;
    }


    private static int findSmallest(List<Integer> arr) {
        //inicio com o primeiro elemento
        int smallest = arr.get(0);
        int smallestIndex = 0;

        //comparo com os demais elementos
        for (int i = 0; i < arr.size(); i++) {
            //se o elemento atual for menor que o menor elemento
            if (arr.get(i) < smallest) {
                //atualizo o menor elemento
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }

        //retorno o indice do menor elemento
        return smallestIndex;
    }

    /*
        Versão 2
     */

    // this version uses raw arrays instead of ArrayList
    public static void selectionSort2(int[] target) {
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
    }


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(selectionSort(arr)); //[2, 3, 5, 6, 10]
    }


}
