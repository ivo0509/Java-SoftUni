package _05_JavaOOPExam_10April2021.aquarium.entities.aquariums;

public class FreshwaterAquarium extends BaseAquarium {

    private static final int CAPACITY = 50;

    public FreshwaterAquarium(String name) {
        super(name, CAPACITY);
    }
}
