import java.util.Scanner;

public class Demo {
    public static void main(String... args) {
       //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter your name: ");
       String name = sc.nextLine();

       System.out.printf("Your name is %s\n", name);


       for(int i = 1; i < 10; i++) {
	  for(int j = 1; j < i; j++) {
              System.out.print(i + " ");
	  }
	  System.out.println();
       }
    }
}
