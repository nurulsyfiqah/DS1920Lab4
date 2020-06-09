package L4Q6;

public class Q6DoubleLinkedList<T extends Comparable<T>> {
    private Q6DoubleListNode head;

    public Q6DoubleLinkedList() {
        this.head = null;
    }

    public int length(){
        int count = 0;
        Q6DoubleListNode current = head;
        while(current != null){
            current = current.getNext();
            count++;
        }
        return count;
    }

    public void showList(){
        Q6DoubleListNode current = head;

        while(current != null){
            System.out.print(current.toString());
            current = current.getNext();
        }
    }

    public void deleteLeft(){
        if(head != null){
            head = head.getNext();
            head.setPrev(null);
        }else{
            System.out.println("The list is empty");
        }
    }

    public void addLeft(T a){
        head = new Q6DoubleListNode(a,null,head);
    }

    public void addRight(T a){
        Q6DoubleListNode newNode = new Q6DoubleListNode(a,null,null);
        Q6DoubleListNode current = head;

        if(head == null){
            head = newNode;
        }else{
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newNode);
            newNode.setPrev(current);
        }
    }

    public void deleteRight(){
        Q6DoubleListNode current = head;
        Q6DoubleListNode prev = head;
        if(head != null){
            if(current.getNext() == null){
                head = null;
            }else{
                while(current.getNext() != null){
                    prev = current;
                    current = current.getNext();
                }
                current = null;
                prev.setNext(null);
            }
        }else
            System.out.println("The list is empty");
    }

    public void addByPos(T a, int index){
        if(index == 0){
            addLeft(a);
        }else if(index == length()){
            addRight(a);
        }else if(index>length()){
            System.out.println("Invalid index. No node inserted");
        }else{
            Q6DoubleListNode newNode = new Q6DoubleListNode(a,null,null);
            Q6DoubleListNode current = head;
            for(int i=2; i<index; i++){
                current = current.getNext();
            }
            Q6DoubleListNode temp = current.getNext();
            current.setNext(newNode);
            newNode.setLink(current,temp);
            if(temp != null){
                temp.setPrev(newNode);
            }
        }
    }

    public void deleteByPos(int index){
        if(index == 0){
            deleteLeft();
        }else if(index == length()-1){
            deleteRight();
        }else if(index >= length()){
            System.out.println("Invalid index. No node deleted");
        }else{
            Q6DoubleListNode current = head;
            for(int i=2; i<index; i++){
                current = current.getNext();
            }
            Q6DoubleListNode temp = current.getNext();
            current.setNext(temp.getNext());
            if(temp.getNext() != null){
                temp.getNext().setPrev(current);
            }
            temp = null;
        }
    }

    public void delete(Q6DoubleListNode del){

        if(head==null || del==null){
            return;
        }
        if(head == del){
            head = del.getNext();

        }
        if(del.getNext() != null){
            del.getNext().setPrev(del.getPrev());
        }
        if(del.getPrev() != null){
            del.getPrev().setNext(del.getNext());
        }

    }

    public void removeEven() {
        Q6DoubleListNode current = head;
        Q6DoubleListNode next ;

        while(current != null){
            next = current.getNext();

            if((int)current.getData()%2==0 && (int)current.getData()!=0){
                delete(current);
            }
            current = next;
        }

    }
}
