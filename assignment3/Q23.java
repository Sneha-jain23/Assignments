/*
WAP to check wheather number is even or odd
 */
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number=");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is even");
        }
        else
        System.out.print(num+" is odd");
    }
}