import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        برنامه‌ای بنوسید که با ورودی گرفتن یک حرف کوچک انگلیسی تعیین کند این حرف کاراکتر چندم الفباست.
         */

//        System.out.println("Hello world!");
//        Scanner scanner = new Scanner(System.in);
//        char c = scanner.next().charAt(0);
//        System.out.println(c - 'a' + 1);


        /*
        برنامه‌ای بنویسید که یک حرف کوچک انگلیسی می‌گیرد و حرف بعدی آن را چاپ می‌کند
       (فرض کنید در ورودی به شما ۲۵ حرف اول را می‌دهد یعنی z را به عنوان ورودی نمی‌دهد.) مثلا اگر ورودی b داد شما باید c را چاپ کنید.
        */

//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        char ch = str.charAt(0);
//        int id = (int)(ch);
//        id += 1;
//        System.out.println((char)(id));

        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        char y = sc.next().charAt(0);

        System.out.println(y - x);
    }
}