package Main;

import java.util.List;

public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sport;


    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public List<Sport> getSport() {
        return sport;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }

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
