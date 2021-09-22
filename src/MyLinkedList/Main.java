package MyLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i = 0; i < 5; i++){
            int a = (int)(Math.random()*10);
            list.add(a);
        }
        list.print();
        list.add(20,5);
        list.add(19, 7);
        list.add(-1, 9);
        list.add(18, 1);

        list.print();

        list.remove(-1);
        list.remove(20);
        list.remove(18);
        list.print();
    }
}
