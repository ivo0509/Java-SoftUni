package _07_JavaOOPExam_15August2021.restaurant.entities.healthyFoods;

public class Salad extends Food {

    private static final double InitialSaladPortion = 150;

    public Salad(String name, double price) {
        super(name, InitialSaladPortion, price);
    }
}
