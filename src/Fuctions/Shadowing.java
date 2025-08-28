package Fuctions;
public class Shadowing {
    static int x = 90;// this will be shawdoed at line 8
    public static void main(String[] args) {
        System.out.println(x);
        int x= 40;//the class varible at line 4 is shawdwd at this line
        fun();
        System.out.println(x);
    }
    static void fun(){
        System.out.println(x);
    }
}
