package A2_Shapes;

public abstract class Shape {

    private Double perimeter;
    private Double area;

    public Double getPerimeter() {

        return perimeter;
    }

    protected void setPerimeter(Double perimeter) {

        this.perimeter = perimeter;
    }

    protected final double getArea() {

        return area;
    }

    protected void setArea(Double area) {

        this.area = area;
    }

    protected abstract void calculatePerimeter();

    protected abstract void calculateArea();
}