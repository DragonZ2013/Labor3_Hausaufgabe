package Main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Sport> sportList= new ArrayList<>();
        Sport sport1 = new Basketball();
        Sport sport2 = new Fussball();
        Sport sport3 = new Hindernislauf();
        Sport sport4 = new Hochsprung();
        sportList.add(sport1);
        sportList.add(sport2);
        sportList.add(sport3);
        sportList.add(sport4);
        Benutzer user1 = new Benutzer("Popescu","Dragos",sportList);
        System.out.println(user1.kalkuliereZeit());
        System.out.println(user1.kalkuliereZeit(sport2));
        System.out.println(user1.kalkuliereDurschnittszeit());

    }
}
