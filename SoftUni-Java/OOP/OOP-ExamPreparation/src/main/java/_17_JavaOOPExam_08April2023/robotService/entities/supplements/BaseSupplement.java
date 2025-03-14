package _17_JavaOOPExam_08April2023.robotService.entities.supplements;

public abstract class BaseSupplement implements Supplement {

    private int hardness;
    private double price;

    protected BaseSupplement(int hardness, double price) {
        this.hardness = hardness;
        this.price = price;
    }

    @Override
    public int getHardness() {
        return this.hardness;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
