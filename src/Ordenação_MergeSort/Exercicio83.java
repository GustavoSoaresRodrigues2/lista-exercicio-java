package Ordenação_MergeSort;

import java.util.Scanner;

public class Exercicio83 {
    // Função para realizar a ordenação Merge Sort
    public static void mergeSort(char[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    // Função auxiliar para mesclar duas submatrizes ordenadas
    public static void merge(char[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        char[] L = new char[n1];
        char[] R = new char[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Função para realizar a busca binária recursiva
    public static int binarySearch(char[] arr, int left, int right, char target) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] > target)
                return binarySearch(arr, left, mid - 1, target);
            return binarySearch(arr, mid + 1, right, target);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicialização do vetor de caracteres
        char[] arr = new char[10];
        System.out.println("Digite os 10 caracteres:");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.next().charAt(0);
        }

        // Ordenação do vetor
        mergeSort(arr, 0, arr.length - 1);

        // Impressão do vetor ordenado
        System.out.println("Vetor ordenado:");
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Busca de um caractere
        System.out.println("Digite o caractere a ser buscado:");
        char target = scanner.next().charAt(0);
        int result = binarySearch(arr, 0, arr.length - 1, target);

        // Verificação do resultado da busca
        if (result != -1) {
            System.out.println("O caractere '" + target + "' foi encontrado no índice " + result + ".");
        } else {
            System.out.println("O caractere '" + target + "' não foi encontrado no vetor.");
        }

        scanner.close();
    }
}