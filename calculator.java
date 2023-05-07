import java.util.Scanner;


public  class calculator {
    public static void main(String[]args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter number 1 ");
       int num1 = in.nextInt();
       System.out.println("Enter number 2 ");
       int num2 = in.nextInt();
       System.out.println("Enter your operator such as - , + , * , /");
        char Calculator1 = in.next().charAt(0);
        switch (Calculator1) {
            case '-':
          int  total = num1 - num2 ; 
          System.out.println(total);
          break;

          case '+':
          int  total1 = num1 + num2 ; 
          System.out.println(total1);
          break;

          case '*':
          int  total2 = num1 * num2 ; 
          System.out.println(total2);
          break;

          case '/':
          double  total3 = num1 / num2 ; 
          System.out.println(total3);
          break;
        
        }

    }
    
}