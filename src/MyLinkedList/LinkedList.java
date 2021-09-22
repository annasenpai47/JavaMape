package MyLinkedList;

public class LinkedList<T>{
    Node <T> head;

    public void add(T item){
        Node<T> temp = new Node<>(item);
        if (head == null){
            head = temp;
        }
        else {
            Node current = head;
            while (current.next!=null){
                current = current.next;
            }
            current.next = temp;
        }
    }

    public void add(T item, int index){
        if (head == null && index == 1){
            head = new Node<>(item);
            return;
        }
        else if((head == null && index!=1)||(index-1 > getSize())){
            System.out.println(item + " " + index +" no");
            return;
        }
        else if(head!= null && index == 1){
            Node temp = head;
            head = new Node<>(item);
            head.next = temp;
            return;
        }
        else if(index+1 == getSize()){
            add(item);
        }

        Node current = head;
        int count = 2;
        while (current!=null){
            if (index == count){
                Node temp = current.next;
                current.next = new Node(item);
                current.next.next = temp;
                break;
            }
            count++;
            current = current.next;
        }
    }

    public void remove(T item){
        if(head.item.equals(item)){
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next!=null){
            if(current.next.item.equals(item)){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
        System.out.println("No "+ item);
    }

    public int getSize(){
        int size = 0;
        Node temp = head;
        while (temp!=null){
            size++;
            temp = temp.next;
        }
        return size;
    }

    public void print(){
        Node current = head;
        while (current!=null){
            System.out.print(current.item+" ");
            current = current.next;
        }
        System.out.println();
    }

}
