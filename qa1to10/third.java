package qa1to10;
import java.util.*;

public class third {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        long a=(long)num;
        float b=(float)a;
        System.out.println("---------The values are-------");
        System.out.println("The integer value is: "+num);
        System.out.println("The int to long value is: "+a);
        System.out.println("The long to float value is: "+b);
        sc.close();
	}

}
