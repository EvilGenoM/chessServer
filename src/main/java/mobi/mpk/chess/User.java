package mobi.mpk.chess;

import java.util.Calendar;

public class User {

    private String name;
    private Calendar timeConnect;

    public User(String name){

        this.name = name;
        timeConnect = Calendar.getInstance();

    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
