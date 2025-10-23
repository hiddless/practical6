
//referance:https://medium.com/@AlexanderObregon/introduction-to-sorting-algorithms-in-java-a-beginners-guide-db522047effb
//same medium referance like mergesort

import java.util.Scanner;

public class quickSort {
    public static void quickSort(int[] duru, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(duru, low, high);
            quickSort(duru, low, pivotIndex - 1);
            quickSort(duru, pivotIndex + 1, high);
        }
    }
    public static int partition(int[] duru, int low, int high) {
        int pivot = duru[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (duru[j] < pivot) {
                i++;
                int temp = duru[i];
                duru[i] = duru[j];
                duru[j] = temp;
            }
        }
        int temp = duru[i + 1];
        duru[i + 1] = duru[high];
        duru[high] = temp;
        return i + 1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("lenth: ");
        int len = scn.nextInt();
        int[] duru = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("duru[" + i + "]: ");
            duru[i] = scn.nextInt();
        }
        quickSort(duru, 0, len - 1);
        System.out.print("sorted={");
        for (int x:duru){
            System.out.print(x+" ");
        }
        System.out.println("}");
    }
}
