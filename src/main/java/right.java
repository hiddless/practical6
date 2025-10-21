import java.util.Scanner;

public class right {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("lenht: ");
        int lenht = scn.nextInt();
        int[]duru= new int[lenht];

        for(int i=0;i<lenht;i++){
            System.out.print("duru["+i+"]: ");
            duru[i]=scn.nextInt();
        }
        System.out.print("n: ");
        int n = scn.nextInt();
        int[]newduru= new int[lenht];
        for(int i=lenht-1;i>=n;i--){
            newduru[i]=duru[i-n];
        }
        for(int i=0;i<n&&i<lenht;i++){
            newduru[i]=0;
        }

        System.out.print("duru={ ");
        for(int i=0;i<lenht;i++){
            System.out.print(newduru[i]);
            if (i < lenht - 1) System.out.print(" ");
        }
        System.out.print(" }");

    }



}
