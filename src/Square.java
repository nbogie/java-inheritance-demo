public class Square extends Shape {
    private float sideLength;

    public Square(float sideLength) {
        super();
        this.sideLength = sideLength;
    }

    @Override
    public float perimiter() {
        return 4 * sideLength;
    }

    @Override
    public float area() {
        return sideLength * sideLength;
    }

    @Override
    public String name() {
        return "square";
    }
}
