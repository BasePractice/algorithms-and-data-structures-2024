package Task1;
import java.util.Scanner;
import java.lang.*;

public class TesterAuthor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String gmail;
        Author kris = new Author("Kris","qwer@mail.com",'m');
        System.out.println(kris);
        kris.setEmail("qawsed@mail.ru");
        System.out.println(kris);
        System.out.println("name is "+kris.getName());
    }
}
