import java.util.Stack;

public class AdvanceStack<T> extends Stack<T> {
    public T peekSecondLast() {
        if (this.size() < 2) {
            return null;
        }
        T top = this.pop();
        T secondLast = this.peek();
        this.push(top);
        return secondLast;
    }

    public void insertAtBottom(T item) {
        if (this.isEmpty()) {
            this.push(item);
            return;
        }

        T temp = this.pop();
        this.insertAtBottom(item);
        this.push(temp);
    }
}
