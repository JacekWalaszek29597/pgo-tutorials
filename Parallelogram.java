public class Parallelogram implements Figure{

    double baseSide;
    double side;
    double height;


    public Parallelogram(double baseSide, double side, double height) {
        this.baseSide = baseSide;
        this.side = side;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2*(side + baseSide);
    }

    @Override
    public double getArea() {
        return height*baseSide;
    }

    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }
}
