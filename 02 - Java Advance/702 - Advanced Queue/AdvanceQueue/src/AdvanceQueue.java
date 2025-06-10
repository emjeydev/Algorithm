import java.util.PriorityQueue;

public class AdvanceQueue<T> extends PriorityQueue<T> {
    public T peekNext() {
        if (this.isEmpty())
            return null;
        return this.peek();
    }

    public void insertAtStart(T item) {
        PriorityQueue<T> newQueue = new PriorityQueue<>();
        newQueue.addAll(this);
        this.clear();
        this.add(item);
        this.addAll(newQueue);
    }
}
