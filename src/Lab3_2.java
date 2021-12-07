import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String password = in.nextLine();
        //StringBuffer strBuffer = new StringBuffer(password);
        //Второй вариант: просто расскомментировать StringBuffer, оставив всё, что ниже и выше(кроме коммантария и StringBuilder)
        //StringBuilder strBuilder = new StringBuilder(password);
        //Третий вариант: просто расскомментировать StringBuilder, оставив всё, что ниже и выше(кроме коммантария и StringBuffer)
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);
        if (m.find()) {
            System.out.println("Пароль надежный!");
        } else {
            System.out.println("Пароль ненадежный!");
        }
        in.close();
    }
}