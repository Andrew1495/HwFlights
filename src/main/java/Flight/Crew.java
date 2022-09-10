package Flight;

public class Crew{

    protected String name;
    protected Ranks rank;


    public Crew(String name, Ranks rank){
        this.name = name;
        this.rank = rank;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public Ranks getRank() {
        return rank;
    }


    public String relyMessage(){
        return "planes fly enjoy";
    }
}
