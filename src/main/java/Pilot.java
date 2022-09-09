public class Pilot extends Crew {

    private String licence;

    public String getLicence() {
        return licence;
    }

    public Pilot(String name, Ranks rank, String licence) {
        super(name, rank);
        this.licence = licence;
    }



    public String fly(){
        return "plane go brrrrr";
    }
}
