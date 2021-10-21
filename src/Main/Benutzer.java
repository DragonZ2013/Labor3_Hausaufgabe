package Main;

import java.util.List;

public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sport;


    public double kalkuliereZeit(){
        int retSum=0;
        for(Sport s:this.sport)
            retSum+=s.kalkuliereZeit();
        return retSum;
    }

    public double kalkuliereZeit(Sport s){
        return s.kalkuliereZeit();
    }

    public double kalkuliereDurschnittszeit(){
        return kalkuliereZeit()/this.sport.size();
    }

}
