import WrongLoginException.WrongLoginException;
import WrongLoginException.WrongPasswordException;

import java.util.regex.Pattern;

public class Registration {
    public static boolean registration(
            String login,
            String password,
            String confirmPassword
    ) {
        try {
            if (!Pattern.matches("^[a-zA-Z-Z0-9_]{1,20}$", login)) {
                throw new WrongLoginException("не верный лоигн");
            }
            if (!Pattern.matches("^[a-zA-Z-Z0-9_]{1,19}$", password)) {
                throw new WrongPasswordException("Не верный пароль");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не свопадают ");

            }
        } catch (WrongLoginException wrongLoginException) {
            wrongLoginException.printStackTrace();
            return false;
        } catch (WrongPasswordException wrongPasswordException) {
           wrongPasswordException.printStackTrace();
            return false;
        }
        return true;
    }

}
