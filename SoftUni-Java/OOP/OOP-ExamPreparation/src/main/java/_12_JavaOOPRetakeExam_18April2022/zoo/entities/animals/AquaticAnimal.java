package _12_JavaOOPRetakeExam_18April2022.zoo.entities.animals;

public class AquaticAnimal extends BaseAnimal {

    private static final double KG = 2.50;

    public AquaticAnimal(String name, String kind, double price) {
        super(name, kind, KG, price);
    }

    @Override
    public void eat() {
        super.setKg(super.getKg() + 7.50);
    }
}
