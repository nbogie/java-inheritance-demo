public class Circle extends Shape {
    private float radius;

    public Circle(float radius) {
        super();
        this.radius = radius;
    }

    @Override
    public float perimiter() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public float area() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public String name() {
        return "circle";
    }
}
