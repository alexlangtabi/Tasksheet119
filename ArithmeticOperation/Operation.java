package ArithmeticOperation;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
       multiplication mul1= new multiplication();
       division div1 = new division();
       addition add1 = new addition();
       subtraction sub1 = new subtraction();
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter First Number : ");
        int num1 =input.nextInt();
        System.out.println(" Enter Second Number : ");
        int num2 = input.nextInt();

        System.out.println(mul1.mul(num1,num2) + " = " + num1 +" multiply by " +num2);
        System.out.println(div1.div(num1,num2) + " = " + num1 +" divided by " +num2);
        System.out.println(add1.add(num1,num2) + " = " + num1 +" added by " +num2);
        System.out.println(sub1.sub(num1,num2) + " = " + num1 +" subtract by " +num2);
        input.close();
    }
}
class multiplication{
    int mul(int num1, int num2) {
        return num1*num2;
    }
}
class division {
    float div(float num1, float num2) {
        return num1/num2;
    }
}
class addition {
    int add(int num1, int num2) {
        return num1+num2;
    }
}
class subtraction {
    int sub( int num1, int num2) {
        return num1-num2;
    }
}
