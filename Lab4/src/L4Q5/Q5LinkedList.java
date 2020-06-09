package L4Q5;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Q5LinkedList<T extends Comparable<T>> {
    private Q5ListNode head;

    public Iterator<T> listIterator(){
        return new Q5LinkedListIterator();
    }
    public class Q5LinkedListIterator implements Iterator<T>{
        private Q5ListNode current;
        private Q5ListNode<T> prev;
        private Q5ListNode<T> prev2;
        private boolean removeCalled;

        public Q5LinkedListIterator(){
            current = head;
            prev = null;
            prev2 = null;
            removeCalled = false;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if(current == null){
                throw new NoSuchElementException();
            }
            T temp =(T) current.getData();
            prev2 = prev;
            prev = current;
            current = current.getLink();
            removeCalled = false;
            return temp;
        }

        @Override
        public void remove() {
            if(prev == null || removeCalled){
                throw new IllegalStateException();
            }else if(prev2 == null){
                head = current;
            }else{
                prev2.setLink(current);
            }
            removeCalled = true;
        }
    }

    public void showList() {
        Q5ListNode current = head;
        while (current != null) {
            System.out.print(current);
            current = current.getLink();
        }
    }

    public void addNote(T a) {
        Q5ListNode newHead = new Q5ListNode(a, null);
        Q5ListNode current = head;
        if (head == null) {
            head = newHead;
        } else {
            while (current.getLink() != null) {
                current = current.getLink();
            }
            current.setLink(newHead);
        }
    }

    public int length() {
        Q5ListNode current = head;
        int count = 0;
        while (current != null) {
            current = current.getLink();
            count++;
        }
        return count;
    }

    public void delete() {
        Q5ListNode current = head;
        Q5ListNode prev = head;
        if (head != null) {
            if (current.getLink() == null) {
                head = null;
            } else {
                while (current.getLink() != null) {
                    prev = current;
                    current = current.getLink();
                }
                prev.setLink(null);
            }
        } else
            System.out.println("The list is empty");
    }

    public void deleteFront() {
        if (head != null) {
            head = head.getLink();
        } else {
            System.out.println("The list is empty");
        }
    }
  
}

