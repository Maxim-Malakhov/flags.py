import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the two-letter country code: ");
        String country = scanner.nextLine();
       
        StringBuilder flag = new StringBuilder();
       
        for (int i = 0; i < country.length(); i++) {
            flag.append(Character.toChars(Character.codePointAt(country, i) + 127397));
        }
        System.out.println(flag.toString());
    }
}
