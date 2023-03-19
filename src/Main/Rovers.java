package Main;

public class Rovers {
    Location location = new Location(0,0);
    Direction direction = new N();

    public Rovers(Location location, Direction direction){
        this.location = location;
        this.direction = direction;
    }
}