package qa1to10;
import java.util.*;

public class eighth
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        System.out.println("ADD      ="+(a+b));
        System.out.println("SUB      ="+(a-b));
        System.out.println("MUL      ="+(a*b));
        System.out.println("DIV      ="+(a/b));
        System.out.println("MOD      ="+(a%b));
        sc.close();
	}

}
