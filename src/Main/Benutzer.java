package Main;

import java.util.List;

public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sport;

    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    /**
     *
     * @return String
     */
    public String getVorName() {
        return vorName;
    }

    /**
     *
     * @param vorName:String
     */
    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    /**
     *
     * @return String
     */
    public String getNachName() {
        return nachName;
    }

    /**
     *
     * @param nachName:String
     */
    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    /**
     *
     * @return Lost<Sport>
     */
    public List<Sport> getSport() {
        return sport;
    }

    /**
     *
     * @param sport:List<Sport>
     */
    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }

    /**
     *Returns the total of time taken by sports in array
     * @return double
     */
    public double kalkuliereZeit(){
        int retSum=0;
        for(Sport s:this.sport)
            retSum+=s.kalkuliereZeit();
        return retSum;
    }

    /**
     *Returns the amount of time taken by sport s
     * @param s:Sport
     * @return double
     */
    public double kalkuliereZeit(Sport s){
        return s.kalkuliereZeit();
    }


    /**
     *Returns the average time of sports in array
     * @return double
     */
    public double kalkuliereDurschnittszeit(){
        return kalkuliereZeit()/this.sport.size();
    }

}
