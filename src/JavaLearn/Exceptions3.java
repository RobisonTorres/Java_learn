package JavaLearn;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};

        //complete the code
        try {
            System.out.println(categories[choice]);
        } catch(Exception e) {
            System.out.println("Wrong Option");
        }
    }
}