import java.util.Scanner;

public class shiftingarrayleft {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("lenght= ");
        int lenght = scn.nextInt();
        int [] duru = new int [lenght];
        for(int i=0;i<lenght;i++){
            System.out.print("duru["+i+"]=");
            duru[i] = scn.nextInt();
        }
        System.out.print("n: ");
        int n = scn.nextInt();
        if(n>=lenght){
            for (int i=0;i<lenght;i++) duru[i]=0;
        }else {
            for (int i=0;i<lenght-n;i++){
                duru[i]=duru[i+n];
            }
            for (int i=lenght-n;i<lenght;i++){
                duru[i]=0;
            }
        }
        System.out.print("new={ ");
        for(int i=0;i<lenght;i++) System.out.print(duru[i]+" ");
        System.out.println("}");
    }
}
