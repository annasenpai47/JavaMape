package ImmutableClass;

import java.util.Date;

public class ImmutableClass {
    private final int i;
    private Object object;
    private final Date start;
    private final Date end;

    private ImmutableClass(int i, Object o, Date start, Date end) {
        this.i = i;
        this.object = o;
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
    }

    public static ImmutableClass getInstance(int i, Object object, Date start, Date end){
        return new ImmutableClass(i, object, start, end);
    }

    public int getI() {
        return i;
    }
    public Date getStart(){
        return new Date(start.getTime());
    }
    public Date getEnd(){
        return new Date(end.getTime());
    }

}
