package HelloWorld;

import java.util.Scanner;

public class Controller {

    private final static String NMBRS = "\\d+";
    Model model;
    View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void startProgram(){
        System.out.println(view.ENTR_SMTH);
        while (!model.rightData()) {
            correctEnter();
            if (!model.rightData()){ System.out.println(view.WRONG_SMTH); }
            else { view.printData(model.getData());}
        }
    }

    private void correctEnter(){

        Scanner sc = new Scanner(System.in);
        String w1, w2;
        while (true){
            w1 = sc.next();
            w2 = sc.next();
            if(!w1.matches(NMBRS) && !w2.matches(NMBRS)){
                model.setWords(w1,w2);
                break;
            }
            else { System.out.println(view.INCOR_DATA); }
        }
    }
}
