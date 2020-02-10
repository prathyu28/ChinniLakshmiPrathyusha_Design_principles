package Calculator_Epam;
import java.util.*;
public class Calculator
   {
      public static void main(String args[])
      {
    	    Scanner s=new Scanner(System.in);
            String op;
            double num1,num2;
            Arithmetic[] operation={new Addition(),new Subtraction(),new Division(),new Multiply()};
       	    String[] operator= {"+","-","/","*"};
       	    int flag=0;
            while(true)
              {
                 System.out.println("Choose any one of the operators {+,-,*,/}.......");
                 op=s.next();
                 for(int i=0;i<operator.length;i++)
                 {
                	 if(op.equals(operator[i]))
                	 {
                		 System.out.println("Enter two operands....");
                         num1=s.nextInt();
                         num2=s.nextInt();
                		 operation[i].calculate(num1,num2);
                		 flag=1;
                		 break;
                	 }
                 }
                 if(flag==0)
                	 System.out.println("Invalid operator");
                 System.out.println("Do you want to continue(y/n)");
                 char ch=s.next().charAt(0);
                 if(ch=='n')
                	 break;
               }
             s.close();
         }
    }



