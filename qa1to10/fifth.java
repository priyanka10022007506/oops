package qa1to10;
import java.util.*;

public class fifth {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        System.out.println("Enter the charecter: ");
        char c=sc.next().charAt(0);
        int ascii=(int)c;
        System.out.println("-----------The charecter revoluion is---------");
        System.out.println("The charecter is "+c);
        System.out.println("The ASCII is "+ascii);
	}

}
