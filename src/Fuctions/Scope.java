package Fuctions;
public class Scope {
    public static void main(String[] args) {
         int a= 10;
         int b=20;
        {
            //already initialized outside the block in the same method, hence we can chage the again
             a=78;// reassign the origin ref variable to some value
            System.out.println(a);
             int c =99;
             //values initialized in this block, will remain in a block
        }
    }
    static void random(int marks){
        int num= 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
