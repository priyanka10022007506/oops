package qa1to10;
import java.util.*;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the name:");
          String name=sc.nextLine();
          System.out.println("Enter the Rollno:");
          long a=(long ) sc.nextInt();
          System.out.println("Enter the Age:");
          int age=sc.nextInt();
          System.out.println("Enter the Gender:");
          char gender=sc.next().charAt(0);
          System.out.println("Enter the Persentage:");
          double per=sc.nextDouble();
          
          System.out.println("\n--- Student Details ---");
          System.out.printf("Name       : %s\n", name);
          System.out.printf("Roll No    : %d\n", a);
          System.out.printf("Age        : %d\n", age);
          System.out.printf("Gender     : %c\n", gender);
          System.out.printf("Percentage : %.2f%%\n", per);

          sc.close();
          
	}

}
