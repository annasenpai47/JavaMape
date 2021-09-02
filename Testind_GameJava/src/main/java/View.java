public class View {
    public final static String START_WORD = " Введи 1 для стандартной игры, 2 - игра со своими пределами";
    public final static String NRM_NMBRS_PLS = "Вводи только нормальные числа";
    public final static String NMBRS_PLS = "Вводи только числа";
    public final static String MIN_MAX_ERROR = "Максимальное меньше минимального, так быть не должно(";
    public final static String ENTR_MIN = "Введи минимум";
    public final static String ENTR_MAX = "Введи максимум";
    public final static String USER_TRY = "Твое число";

    public void printSmth(String[] s){
        System.out.println(s[0]);
        System.out.println(s[1]);
    }

    public void PrintStats(int[] i){
        System.out.println("Попыток угадать число: "+ i[0]+ ", а безполезных всего "+ i[1]);
    }

}
