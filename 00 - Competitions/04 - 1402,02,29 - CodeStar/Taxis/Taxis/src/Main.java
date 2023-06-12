//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        int d, count = 0;
//
//        PriorityQueue<Integer> people = new PriorityQueue<Integer>();
//
//        for (int i = 0; i < 4 * n; i++) {
//            d = sc.nextInt();
//            people.add(d);
//        }
//
//        List<Integer> discomforts = calculateDiscomforts(n, people);
//
//        // چاپ محاسبه شده‌های ناراحتی در هر تاکسی
//        for (int discomfort : discomforts) {
//            System.out.println(discomfort);
//        }
//
//
//
//    }
//}
//
//    private static List<Integer> calculateDiscomforts(int n, Queue<Integer> destinations) {
//        List<Integer> discomforts = new ArrayList<>();
//
//        // ایجاد یک صف برای نگهداری مسافران
//        Queue<Integer> queue = new LinkedList<>(destinations);
//
//        // بررسی هر تاکسی به ترتیب
//        for (int i = 0; i < n; i++) {
//            // شمارنده‌ای برای ناراحتی‌ها در هر تاکسی
//            int discomfortCount = 0;
//
//            // بررسی 4 نفر در تاکسی فعلی
//            for (int j = 0; j < 4; j++) {
//                int destination1 = queue.poll(); // مقصد مسافر
//                int destination2 = queue.poll(); // مقصد مسافر
//                int destination3 = queue.poll(); // مقصد مسافر
//                int destination4 = queue.poll(); // مقصد مسافر
//
//                // بررسی اینکه آیا مسافر در صندلی جلو باید بنشیند یا خیر
//                if (j != 0 && queue.contains(destination)) {
//                    discomfortCount++;
//                }
//            }
//
//            discomforts.add(discomfortCount);
//        }
//
//        return discomforts;
//    }
//}


