package _13_JavaOOPExam_14August2022.football.entities.supplement;

public abstract class BaseSupplement implements Supplement {

    private int energy;
    private double price;

    protected BaseSupplement(int energy, double price) {
        this.energy = energy;
        this.price = price;
    }

    @Override
    public int getEnergy() {
        return this.energy;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
