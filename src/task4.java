import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int  counteq=0;

        int[] input = new int[4];
        System.out.print("Enter first number : ");
       input[0]=  scanner.nextInt();
        System.out.print("Enter second number : ");
        input[1]=  scanner.nextInt();
        System.out.print("Enter third number : ");
        input[2]=  scanner.nextInt();
        System.out.print("Enter fourth number : ");
        input[3]=  scanner.nextInt();
        for (int i=0;i<input.length;i++){
            for (int j=1+i;j<input.length-i;j++){
                if(input[i]==input[j])
                {
                 counteq++;
                }
                else
                {

                }


            }


        }
        System.out.println(counteq );
            if (counteq==4){
            System.out.println("All numbers are equal");
        }
            else if (counteq==0) {
                System.out.println("All numbers are different");
            }
            else{
                System.out.println("Neither all are equal nor different");
            }




    }
}
