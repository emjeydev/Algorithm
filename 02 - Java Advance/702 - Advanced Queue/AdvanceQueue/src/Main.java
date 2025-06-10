public class Main {
    public static void main(String[] args) {
        AdvanceQueue<Integer> queue = new AdvanceQueue<>();
        queue.add(20);
        queue.add(30);
        queue.insertAtStart(50);

        Integer nextItem = queue.peekNext();
        System.out.println("Peek Next: " + nextItem); // Output: 10


        AdvanceStack<String> stack = new AdvanceStack<>();
        stack.push("Secret 1");
        stack.push("Secret 2");
        stack.push("Secret 3");
        stack.push("Secret 4");
        stack.push("Secret 5");

        String secondLast = stack.peekSecondLast();
        System.out.println("Peek Second Last: " + secondLast);

        stack.insertAtBottom("New Secret");

        while (!stack.isEmpty()) {
            String item = stack.pop();
            System.out.println(item);
        }
    }
}
