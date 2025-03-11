package _05_JavaOOPExam_10April2021.aquarium.entities.decorations;

public class Ornament extends BaseDecoration {

    private static final int COMFORT = 1;
    private static final double PRICE = 5;

    public Ornament() {
        super(COMFORT, PRICE);
    }
}
