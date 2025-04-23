package a04Oops;

public class Superhero {
	private String name;
    private char rank;
    private Boolean superspeed;
    private Boolean superstrength;
    
    public Superhero() {
        this.name = "Tony Star";
        this.rank = 'S';
        this.superspeed = false;
        this.superstrength = false;
     }
    

    public Superhero(String name, char rank, Boolean superspeed, Boolean superstrength) {
        this.name = name;
        this.rank = rank;
        this.superspeed = superspeed;
        this.superstrength = superstrength;
    }

    public void show() {
        System.out.println("Superhero:\nName: " + name + "\nRank: " + rank + "\nSuperspeed: " + superspeed + "\nSuperstrength: "
                + superstrength);
    }
}
