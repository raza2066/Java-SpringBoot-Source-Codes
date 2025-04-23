package a04Oops;

class superheroA{
    private String name;
    private char rank;
    private Boolean superspeed;
    private Boolean superstrength;

    public superheroA(String name, char rank, Boolean superspeed, Boolean superstrength) {
        this.name = name;
        this.rank = rank;
        this.superspeed = superspeed;
        this.superstrength = superstrength;
    }

    @Override
    public String toString() {
        return "Superhero [name=" + name + ", rank=" + rank + ", superspeed=" + superspeed + ", superstrength="
                + superstrength + "]";
    }
}

public class Z05Constructors {
    public static void main(String[] args) {
        superheroA ironMan = new superheroA("Tony Stark", 'S', false, false);
        System.out.println(ironMan.toString());
    }
}
