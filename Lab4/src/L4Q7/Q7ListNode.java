package L4Q7;

public class Q7ListNode<T> {
    private T data;
    private Q7ListNode link;

    public Q7ListNode() {
        this.data = null;
        this.link = null;
    }

    public Q7ListNode(T data, Q7ListNode link) {
        this.data = data;
        this.link = link;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Q7ListNode getLink() {
        return link;
    }

    public void setLink(Q7ListNode link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return data+" --> ";
    }
}
