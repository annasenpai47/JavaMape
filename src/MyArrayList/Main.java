package MyArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 16; i++){
            arr.add((int)(Math.random()*10));
        }
        arr.print();
    }
}