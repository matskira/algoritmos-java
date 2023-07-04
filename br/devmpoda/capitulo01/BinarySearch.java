package br.devmpoda.capitulo01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {


    private static Integer binarySearch(int[] list, int item) {
        int baixo = 0;
        int alto = list.length - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = list[meio];
            if (chute == item) {
                return meio;
            }
            if (chute > item) {
                alto = meio - 1;

            } else {
                baixo = meio + 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Integer> listaInteiros = Arrays.asList(1,5,8,10,12,16,19,24,26,46,84);
        int[] minhaLista = {42,36,29,25,14,8,3,1};
        int item = 24;
        System.out.println(Collections.binarySearch(listaInteiros, item));
        System.out.println(binarySearch(minhaLista, 8));
    }
}
