import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("lenght: ");
        int lenght = scn.nextInt();

        int [] duru = new int [lenght];
        for(int i=0;i<lenght;i++){
            System.out.println("duru["+i+"]=");
            duru[i]=scn.nextInt();
        }

        for(int i=0; i<lenght/2;i++){
            swap(duru,i,lenght-i-1);
        }
        System.out.print("rev: ");
        for(int rev:duru){
            System.out.print(rev + " ");
        }
    }
    static void swap(int[] duru,int i,int j){
        int temp = duru[i];
        duru[i] = duru[j];
        duru[j] = temp;
    }
}
