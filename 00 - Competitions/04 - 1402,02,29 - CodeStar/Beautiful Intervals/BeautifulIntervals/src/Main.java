import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // خواندن تعداد تست‌ها
        int t = scanner.nextInt();

        // نمایش زیرلایه‌ها بر اساس قوانین آرایش الکترونی
        Map<Character, String> sublevels = createSublevelsMap();

        // خواندن نام عناصر و نمایش آرایش الکترونی
        for (int i = 0; i < t; i++) {
            String elementName = scanner.next();
            String electronConfiguration = getElectronConfiguration(elementName, sublevels);
            System.out.println(electronConfiguration);
        }
    }

    private static Map<Character, String> createSublevelsMap() {
        Map<Character, String> sublevels = new HashMap<>();
        sublevels.put('s', "s");
        sublevels.put('p', "s p");
        sublevels.put('d', "s p d");
        sublevels.put('f', "s p d f");
        return sublevels;
    }

    private static String getElectronConfiguration(String elementName, Map<Character, String> sublevels) {
        StringBuilder configuration = new StringBuilder();
        int atomicNumber = getAtomicNumber(elementName);
        int remainingElectrons = atomicNumber;

        // اضافه کردن زیرلایه‌های الکترونی به ترتیب
        for (char sublevel : sublevels.keySet()) {
            String sublevelName = sublevels.get(sublevel);
            int sublevelCapacity = getSublevelCapacity(sublevel);

            if (remainingElectrons >= sublevelCapacity) {
                configuration.append(sublevelName).append(sublevelCapacity).append(" ");
                remainingElectrons -= sublevelCapacity;
            } else {
                configuration.append(sublevelName).append(remainingElectrons).append(" ");
                break;
            }
        }

        return configuration.toString().trim();
    }

    private static int getAtomicNumber(String elementName) {
        // نام عناصر و تعداد اتمی آن‌ها
        String[] elements = {"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar", "K", "Ca"};
        int[] atomicNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        // جستجوی نام عنصر و بازگرداندن تعداد اتمی آن
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equalsIgnoreCase(elementName)) {
                return atomicNumbers[i];
            }
        }

        return 0;
    }

    private static int getSublevelCapacity(char sublevel) {
        // تعداد الکترون‌های قابل جایگذاری در هر زیرلایه
        if (sublevel == 's') {
            return 2;
        } else if (sublevel == 'p') {
            return 6;
        } else if (sublevel == 'd') {
            return 10;
        } else if (sublevel == 'f') {
            return 14;
        }
        return 0;
    }
}