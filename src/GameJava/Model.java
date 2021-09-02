package GameJava;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.random;

public class Model {
    private static final String[] gong = {"Ура!","Ты победил!"};
    public boolean winGame = false;

    public List<Integer> arr = new ArrayList<>();
    public int[] count = {1, 0};
    String[] tries = new String[2];

    private int min = 0;
    private int max = 100;
    private boolean typeGame;
    private int unknown;

    public void setTypeGame(boolean typeGame){
        this.typeGame = typeGame;
    }
    public boolean getTypeGame(){
        return typeGame;
    }
    public void setUnknown(int unknown){
        this.unknown = unknown;
    }
    public int getUnknown(){
        return unknown;
    }



    public String[] userTry(int i){
        arr.add(i);
        if(i == unknown){
            winGame = true;
            return gong;
        }
        else {
            tries[0] += i + "; ";
            count[0]++;
            if (i<min || i>max){
                count[1]++;
            }

            if (i>unknown){
                tries[1] = "Искаемое число меньше чем " + i;
                max = i-1;
            }
            else {
                tries[1] = "Искаемое число больше чем " + i;
                min = i + 1;
            }
            return tries;
        }

    }

    public int[] getStats(){
        return count;
    }



    public int rand() {
        tries[0] = "0...100 [";
        return (int) (random() * 101);
    }

    public int rand(int a, int b) {
        this.min = a;
        this.max = b;
        tries[0] = a+"..."+b+" [";
        return (int) (random() * (b - a) + a);
    }

}
