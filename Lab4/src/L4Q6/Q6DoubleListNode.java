package L4Q6;

public class Q6DoubleListNode<T> {
    private T data;
    private Q6DoubleListNode prev;
    private Q6DoubleListNode next;

    public Q6DoubleListNode() {
        this.data = null;
        this.prev = null;
        this.next = null;
    }

    public Q6DoubleListNode(T data, Q6DoubleListNode prev, Q6DoubleListNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Q6DoubleListNode getPrev() {
        return prev;
    }

    public void setPrev(Q6DoubleListNode prev) {
        this.prev = prev;
    }

    public Q6DoubleListNode getNext() {
        return next;
    }

    public void setNext(Q6DoubleListNode next) {
        this.next = next;
    }

    public void setLink(Q6DoubleListNode a,Q6DoubleListNode b){
        prev = a;
        next = b;
    }

    @Override
    public String toString() {
        return " <-- "+data+" --> ";
    }
}
