import java.util.Scanner;

public class scannerAssignment {

    public class Main {
        public static void main(String[] args) {


            Scanner input = new Scanner(System.in);

            System.out.print("Enter name: ");
            String name = input.nextLine();

            System.out.println(name);
            System.out.println("Hey " + name);
            System.out.println(name + " is a beautiful name");

            System.out.println("Enter adress: ");
            String address = input.nextLine();

            System.out.println("Enter your number: ");
            int number = input.nextInt();

            System.out.println("Name: " + name + "\nAddress: " + address + "\nPhone number: " + number);
        }
    }
}
