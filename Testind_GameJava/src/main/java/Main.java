import GameJava.Controller;
import GameJava.Model;
import GameJava.View;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller(new Model(),new View());
        controller.startGame();

    }

}
