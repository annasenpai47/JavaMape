package MyArrayList;

public class ArrayList<T> {
    private final int SIZE = 16;
    public Object[] array = new Object[SIZE];
    private int index = 0;

    public void add(T item){
        if(index == array.length){
            array = recreate();
        }
        array[index++] = item;

    }

    public void print(){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    public Object[] recreate(){
        Object[] newArr = new Object[array.length+(int)(array.length/1.5)];
        for(int i = 0; i<array.length; i++){
            newArr[i] = array[i];
        }
        return newArr;
    }
}
