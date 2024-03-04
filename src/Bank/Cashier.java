package Bank;
import java.awt.*;

public class Cashier extends Dice {
    public static void main(String[] args) {
        try {
            welcome();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void welcome() {
        Login Login = new Login();
        Login.loginB();

        Choices Choices = new Choices();
        Choices.choices();;
    }
}
