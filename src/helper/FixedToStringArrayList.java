package helper;

import java.util.ArrayList;
import java.util.Iterator;

public class FixedToStringArrayList<T> extends ArrayList<T> {

    @Override
    public String toString() {
        Iterator<T> it = iterator();
        if (!it.hasNext())
            return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append(' ');
        for (; ; ) {
            T e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (!it.hasNext())
                return sb.append(' ').toString();
            sb.append(',').append('\n');
        }
    }
}
