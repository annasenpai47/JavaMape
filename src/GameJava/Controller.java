package GameJava;

import java.util.Scanner;

public class Controller {

    Model model;
    View view;


    public Controller(Model a, View b){
        view = b;
        model = a;
    }

    public void startGame(){
        System.out.println(view.START_WORD);
        model.setTypeGame(typeGame());
        if (model.getTypeGame()){
            model.setUnknown(model.rand());
        }
        else {
            startUserGame();
        }
        while (!model.winGame) {
            entrNum();

        }
        view.PrintStats(model.getStats());
    }

    //exit
    private void entrNum(){
        System.out.println(view.USER_TRY);
        String i = "";
        int num = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            i = sc.nextLine();
            try {
                num = Integer.parseInt(i);
                break;
            } catch (Exception e) {
                System.out.println(view.NMBRS_PLS);
                continue;
            }
        }
        view.printSmth(model.userTry(num));

    }

    private void startUserGame(){
        int Umin = 0; int Umax = 0;
        while (true){
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println(view.ENTR_MIN);
                Umin = sc.nextInt();
                System.out.println(view.ENTR_MAX);
                Umax = sc.nextInt();
            }
            catch (Exception e){
                System.out.println(view.NMBRS_PLS);
                continue;
            }
            if(Umin>=Umax){
                System.out.println(view.MIN_MAX_ERROR);
            }
            else {
                model.setUnknown(model.rand(Umin,Umax));
                break;
            }
        }
    }

    private boolean typeGame(){

        int i = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            try {
                i = sc.nextInt();
            } catch (Exception e) {
                System.out.println(view.NMBRS_PLS);
                continue;
            }
            if (i==1 || i==2){break;}
            else { System.out.println(view.NRM_NMBRS_PLS); }
        }
        switch (i){
            case 1:
                return true;
            default:
                return false;
        }

    }


}
