import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra: ");
        String input = scanner.nextLine();

        try {
            if (PalindromeChecker.isPalindrome(input)) {
                System.out.println("Chuỗi \"" + input + "\" là chuỗi đối xứng (palindrome).");
            } else {
                System.out.println("Chuỗi \"" + input + "\" không phải là chuỗi đối xứng.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}