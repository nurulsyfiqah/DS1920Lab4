package L4Q8;


public class Q8CircularLinkedList<T extends Comparable<T>>  {

    private Q8ListNode head;
    private Q8ListNode tail;
    private int length;

    public Q8CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public int length(){
        return length;
    }

    public void addCircularNode(T a){
        Q8ListNode<T> newNode = new Q8ListNode<>(a, null);
        if(head==null){
            head=newNode;
        }else{
            tail.setLink(newNode);
        }
        tail=newNode;
        tail.setLink(head);
        length++;
    }

    public void showCircularList(){
        Q8ListNode<T> current=head;
        int count=0;
        int num=length();
        while(count<=length){
            System.out.print(current.toString());
            current=current.getLink();
            count++;
        }
    }

    public T getCircularItem(int index){
        Q8ListNode<T> currrent=head;
        for(int i=1; i<index; i++){
            currrent=currrent.getLink();
        }
        return (T)currrent.getData();
    }
}
