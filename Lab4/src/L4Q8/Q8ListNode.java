package L4Q8;

public class Q8ListNode<T> {
    private T data;
    private Q8ListNode link;

    public Q8ListNode() {
        this.data = null;
        this.link = null;
    }

    public Q8ListNode(T data, Q8ListNode link) {
        this.data = data;
        this.link = link;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Q8ListNode getLink() {
        return link;
    }

    public void setLink(Q8ListNode link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Music : "+data+" --> ";
    }
}
