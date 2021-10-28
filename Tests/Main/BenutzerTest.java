package Main;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {

    @org.junit.jupiter.api.Test
    void kalkuliereZeit() {
        List<Sport> sportList= new ArrayList<>();
        Sport sport1 = new Basketball();
        Sport sport2 = new Fussball();
        Sport sport3 = new Hindernislauf();
        Sport sport4 = new Hochsprung();
        sportList.add(sport1);
        sportList.add(sport2);
        sportList.add(sport3);
        sportList.add(sport4);
        Benutzer user = new Benutzer("Emil","Robert",sportList);
        assert(user.kalkuliereZeit()==170);

    }

    @org.junit.jupiter.api.Test
    void testKalkuliereZeit() {
        List<Sport> sportList= new ArrayList<>();
        Sport sport1 = new Basketball();
        Sport sport2 = new Fussball();
        Sport sport3 = new Hindernislauf();
        Sport sport4 = new Hochsprung();
        sportList.add(sport1);
        sportList.add(sport2);
        sportList.add(sport3);
        sportList.add(sport4);
        Benutzer user = new Benutzer("Emil","Robert",sportList);
        assert(user.kalkuliereZeit(sport2)==65);

    }

    @org.junit.jupiter.api.Test
    void kalkuliereDurschnittszeit() {
        List<Sport> sportList= new ArrayList<>();
        Sport sport1 = new Basketball();
        Sport sport2 = new Fussball();
        Sport sport3 = new Hindernislauf();
        Sport sport4 = new Hochsprung();
        sportList.add(sport1);
        sportList.add(sport2);
        sportList.add(sport3);
        sportList.add(sport4);
        Benutzer user = new Benutzer("Emil","Robert",sportList);
        assert(user.kalkuliereDurschnittszeit()==42.5);
    }
}