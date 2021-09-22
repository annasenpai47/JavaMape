package NumderOfElem;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        int size = 10;

        for (int i = 0; i < size; i++){
            arr.add((int) (Math.random()*21-10));
        }

        for (Iterator i = arr.iterator();i.hasNext();){
            int temp = (int) i.next();
            if(!map.containsKey(temp)){
                map.putIfAbsent(temp,1);
            }
            else{
                map.merge(temp, 1, (oldV, newV) -> oldV +newV);
            }
        }

        System.out.println(arr.toString());
        System.out.println(map.toString());
    }
}
