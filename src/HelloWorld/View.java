package HelloWorld;

public class View {
    public final static String ENTR_SMTH = "Say hello...";
    public final static String INCOR_DATA = "Use only letters";
    public final static String WRONG_SMTH = "No, say hello pls.";
    public final static String USER_DATA = "User data: ";

    public void printData(String s){
        System.out.println(USER_DATA + s);
    }
}
