import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);

    static String answerKey(String ans) {
        String res = "";

        if (ans.equals("A")) {
            res = "#000";
        } else if (ans.equals("B")) {
            res = "0#00";
        } else if (ans.equals("C")) {
            res = "00#0";
        } else if (ans.equals("D")) {
            res = "000#";
        }
        return res;
    }

    public static void main(String[] args) {
        int qNum = sc.nextInt();
        String correctAnswers = sc.next();
        int aNum = sc.nextInt();

        List<String> res = new ArrayList<>();

        for (int j = 0; j < correctAnswers.length(); j++) {
            res.add(String.valueOf(correctAnswers.charAt(j)));
        }

        for (int p = 0; p < aNum; p++) {
            int grade = 0;
            int cAnswer = 0;
            int wAnswer = 0;
            for (int i = 0; i < qNum; i++) {
                String answer = sc.next();
                if (answer.equals(answerKey(res.get(i)))) {
                    cAnswer += 1;
                } else if (!answer.equals(answerKey(res.get(i))) && !answer.equals("0000")) {
                    wAnswer += 1;
                }
            }
            grade = 3 * cAnswer - wAnswer;
            System.out.println(grade);
        }


    }
}
