package alpha_;
import java.util.*;
public class Arm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number:");
        int  a=sc.nextInt();
        int g=a;
        int d=0;
        int s=0;
        int f=0;
        while(a>0) {
        	d=(a%10);
        	s=(d*d*d);
        	a=(a/10);
        	f+=s;
        }
        if(f==g) {
        	System.out.println("The given number"+" "+g+" "+"is a armstrong number");
        }
        else {
        	System.out.println("The given number"+" "+g+" "+"is not a armstrong number");
        }
	}
}
