import java.util.ArrayList;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int counter=0;
        Scanner scanner=new Scanner(System.in);
     char[] input;
        System.out.print("input a word :");
       String input_= scanner.nextLine();
      input=  input_.toCharArray();
      int i=0;
        // Loop through the string to count occurrences of 'o'
      while (i<input.length){
          if(input[i]=='o')
          {  counter++;}
          i++;

      }
        System.out.println("Number of 'o' in this text"+"("+input_+")"+":"+  counter);
    }
}
