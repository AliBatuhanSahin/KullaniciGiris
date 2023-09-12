import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username,password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adı : ");
        username = input.nextLine();

        System.out.print("Şifre : ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Ypatınız :)");
        } else {
            System.out.println("Bilgileriniz yanlış");
        }
    }
}