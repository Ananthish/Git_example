package alpha_;
import java.util.*;
public class alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number:");
        int n=sc.nextInt();
        String a="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] ch=new char[a.length()];
        for(int i=0;i<a.length();i++) {
        	ch[i]=a.charAt(i);
        }
        for(int i=0;i<n;i++) {
        	for(int j=0;j<=i;j++) {
        		System.out.print(ch[i]);
        	}
        	System.out.println();
        }
        }

}
