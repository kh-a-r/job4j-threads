package concurrent;

public final class Node {
    private final Node<T> next;
    private final T value;

    public NOde(Node<T> next, T value) {
        this.next = next;
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }
}
