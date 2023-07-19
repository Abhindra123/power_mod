import java.util.Scanner;

public class Main {
    public static int powerMod(int A,int B,int C){
        if(B==0){
            return 1;
        }
        int p=powerMod(A,B/2,C);
        if(B%2==0){
            return (p*p)%C;
        }
        return (p*p*A)%C;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int num=sc.nextInt();
        int power=sc.nextInt();
        int mod= sc.nextInt();
        int val=powerMod(num,power,mod);
        System.out.println("The value is :"+val);
    }
}