//The referance i used (found it in medium):
// https://medium.com/@AlexanderObregon/introduction-to-sorting-algorithms-in-java-a-beginners-guide-db522047effb
//i did what i understand
import java.util.Scanner;

public class mergeSort {
    public static void mergesort(int[] duru, int left, int right){
        if (left < right){
            int mid = left + (right - left) / 2;
            mergesort(duru, left, mid);
            mergesort(duru, mid + 1, right);
            merge(duru, left, mid, right);
        }
    }

    public static void merge(int[] duru, int left, int mid, int right){
        int a = mid - left + 1;
        int b = right - mid;
        int[] leftarr  = new int[a];
        int[] rightarr = new int[b];
        for (int i = 0; i < a; i++) leftarr[i] = duru[left + i];
        for (int j = 0; j < b; j++) rightarr[j] = duru[mid + 1 + j];
        int i = 0, j = 0, k = left;
        while (i < a && j < b) {
            if (leftarr[i] <= rightarr[j]) duru[k++] = leftarr[i++];
            else duru[k++] = rightarr[j++];
        }
        while (i < a) duru[k++] = leftarr[i++];
        while (j < b) duru[k++] = rightarr[j++];
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("duru lenth: ");
        int n = scn.nextInt();
        int[] duru = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("duru[" + i + "]: ");
            duru[i] = scn.nextInt();
        }
        mergesort(duru, 0, n - 1);
        System.out.print("new= { ");
        for (int x : duru) System.out.print(x + " ");
        System.out.println("}");
    }

}
