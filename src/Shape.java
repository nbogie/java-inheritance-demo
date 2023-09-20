
public abstract class Shape {
    /** returns the perimeter around this shape */
    public abstract float perimiter();

    /** returns the area inside this shape */
    public abstract float area();

    /** returns the name of the shape - e.g. square or circle */
    public abstract String name();

    public String report(){
        return "Shape of type: " + name() + " with perimeter " + this.perimiter() + " and area " + this.area();
    }
}
