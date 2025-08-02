package qa1to10;
import java.util.*;

public class tenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
          if(num%3==0 && num%5==0) {
        	  System.out.print("YES");
          }
          else {
        	  System.out.print("NO");
          }
          sc.close();
	}

}
