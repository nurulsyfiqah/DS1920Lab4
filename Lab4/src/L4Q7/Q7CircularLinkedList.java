package L4Q7;

public class Q7CircularLinkedList<T>  {

    private Q7ListNode<T> tail;
    private  Q7ListNode<T> head;
    int length=0;

    public Q7CircularLinkedList() {
        this.tail = null;
        this.head = null;
    }

    public int length(){
        return length;
    }

    public void addCircularNode(T a){ 
        Q7ListNode<T> newNode = new Q7ListNode<>(a, null);
        Q7ListNode<T> current = head;
        if(head==null){
            head=newNode;
        }else{
            tail.setLink(newNode);
            }
        tail=newNode;
        tail.setLink(head);
        length++;
        }

    public void deleteCircularNode(){
        if(head == null) {
            return;
        }
        else {
            if(head != tail) {
                Q7ListNode current = head;
                while(current.getLink()!= tail) {
                    current = current.getLink();
                }
                tail = current;
                tail.setLink(head);
            }
            else {
                head = tail = null;
            }
        }
        length--;
    }

    public void showCircularList(){
        Q7ListNode<T> current=head;
        int count=0;
        int num=length();
        while(count<=length){
            System.out.print(current.toString());
            current=current.getLink();
            count++;
        }
    }

    public T getCircularItem(int index){
        Q7ListNode<T> currrent=head;
        for(int i=1; i<index; i++){
            currrent=currrent.getLink();
        }
        return (T)currrent.getData();
    }

    public void deleteNode(T del){
        Q7ListNode current=head;
        if((T)head.getData()==del){
            head=head.getLink();
            tail.setLink(head);
        }else{
            Q7ListNode<T> next=current.getLink();
            do{
                if((T)next.getData()==del){
                    current.setLink(next.getLink());
                    break;
            }
                length--;
            }while(current!=head);
        }
    }

}
