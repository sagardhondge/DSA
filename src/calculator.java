import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("Select an operator: + - * / % or x to exit");
            char op = in.next().trim().charAt(0);

            // Exit condition
            if (op == 'x' || op == 'X') {
                System.out.println("Exiting calculator.");
                break;
            }

            // Valid operator check
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                switch (op) {
                    case '+':
                        ans = num1 + num2;
                        break;
                    case '-':
                        ans = num1 - num2;
                        break;
                    case '*':
                        ans = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            ans = num1 / num2;
                        } else {
                            System.out.println("Cannot divide by zero.");
                            continue;
                        }
                        break;
                    case '%':
                        ans = num1 % num2;
                        break;
                }
                System.out.println("Answer: " + ans);
            } else {
                System.out.println("Invalid operation.");
            }
        }

        in.close();
    }
}



//import java.util.Scanner;
//
//public class calculator {
//    public static void main(String[] args) {
//        Scanner in =new Scanner(System.in);
//        int ans=0;
//        while(true){
//            System.out.println("Select and operator + - * / %");
//            char op =in.next().trim().charAt(0);
//            if (op== '+'|| op== '-'|| op== '*'
//                    ||op=='/'|| op== '%'){
//                System.out.println("Enter two numbers");
//                int num1=in.nextInt();
//                int num2=in.nextInt();
//
//
//                if (op == '+'){
//                    ans=num1+num2;
//                }
//                if (op=='-'){
//                    ans=num1-num2;
//                }
//                if (op=='*'){
//                    ans=num1*num2;
//                }
//                if(op=='/') {
//                    if (num2!= 0){
//                        ans=num1/num2;
//                    }
//                }
//                if (op=='%'){
//                    ans=num1%num2;
//                }
//                else if (op == 'x'|| op=='X'){
//                    break;
//
//                }else{
//                    System.out.println("Invalid operation");
//                }
//            }
//            System.out.println(ans);
//        }
//    }
//}
