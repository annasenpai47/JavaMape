package HelloWorld;

public class Model {
    private String firstW = new String();
    private String secondW = new String();

    public void setWords(String a, String b){
        firstW = a;
        secondW = b;
    }

    public boolean rightData(){
        if (firstW.equals("Hello") && secondW.equals("world")){ return true; }
        else { return false;}
    }

    public String getData(){
        return firstW +" "+ secondW;
    }

}
