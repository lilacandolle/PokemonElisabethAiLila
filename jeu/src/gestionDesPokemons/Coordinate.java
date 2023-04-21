package gestionDesPokemons;

// La classe Coordinate possède les attrinuts x et y, des getters, et une méthode distance
public class Coordinate {
    
    private double x;
    private double y;

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Coordinate c) {
        return Math.sqrt(Math.pow(this.x - c.getX(), 2) + Math.pow(this.y - c.getY(), 2));
    }
    
}
