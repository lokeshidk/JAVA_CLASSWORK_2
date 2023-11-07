import java.util.Scanner;

public class LOGIN_SYSTEM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username to register ");
        String entered_un = input.nextLine();

        boolean bool = true;
        while (bool) {
            System.out.println("Enter password to register");
            String entered_pd = input.nextLine();

            if (entered_pd.contains("@") && entered_pd.length() >= 8) {
                System.out.println("To login, type 'Login'");
                String function = input.nextLine();
                if (function.equalsIgnoreCase("login")) {
                    System.out.println("Enter username");
                    String username = input.nextLine();
                    System.out.println("Enter password");
                    String password = input.nextLine();

                    if (username.equals(entered_un) && password.equals(entered_pd)) {
                        System.out.println("Welcome");
                        bool = false;
                    } else {
                        System.out.println("Invalid username or password.");
                    }
                }
            } else {
                System.out.println("Try again. Password must be at least 8 characters long and contain '@'.");
            }
        }
    }
}
