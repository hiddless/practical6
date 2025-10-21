import java.util.Scanner;

public class shiftingarrayleft {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("lenght: ");
        int lenght = scn.nextInt();

        int[]duru= new int[lenght];
        for(int i=0;i<lenght;i++){
            System.out.print("duru["+ i +"] = ");
            duru[i]=scn.nextInt();
        }
        System.out.print("n: ");
        int left=scn.nextInt();
        left=left%lenght;
        for(int a=0;a<lenght;a++){
            int first=duru[a];
            for(int i=0;i<lenght-1;i++){
                duru[i]=duru[i+1];
            }
            duru[lenght-1]=first;
        }
        System.out.println("new: ");
        for(int num:duru) System.out.print(num+" ");

    }

}
