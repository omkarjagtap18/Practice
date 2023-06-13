import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The Number : ");
        int a = sc.nextInt();
        System.out.println("Your Entered : "+a);
        int s=0;
        while(a>0){  //  123 greater than 0  12>0  1>0   (0>0 out of the loop) and print the value of s
            s=s*10;  // 0*10=0    4*10=40   43*10=430   432*10=4320
            s=s+(a%10);  // 0+(1234%10) = 4     40+(123%10) = 43    430+(12%10) = 432    4320+(1%10)=4321
            a=a/10;  //  1234/10 = 123    123/10 = 12   12/10 = 1   1/10 = 0
        }
        System.out.println("reversed "+s);
    }
}
