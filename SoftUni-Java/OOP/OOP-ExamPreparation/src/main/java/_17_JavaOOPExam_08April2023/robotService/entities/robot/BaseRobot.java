package _17_JavaOOPExam_08April2023.robotService.entities.robot;

import static _17_JavaOOPExam_08April2023.robotService.common.ExceptionMessages.*;

public abstract class BaseRobot implements Robot {

    private String name;
    private String kind;
    private int kilograms;
    private double price;

    protected BaseRobot(String name, String kind, int kilograms, double price) {
        this.setName(name);
        this.setKind(kind);
        this.setKilograms(kilograms);
        this.setPrice(price);
    }


    @Override
    public void setName(String name) {

        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(ROBOT_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }

        this.name = name;
    }

    private void setKind(String kind) {

        if (kind == null || kind.trim().isEmpty()) {
            throw new NullPointerException(ROBOT_KIND_CANNOT_BE_NULL_OR_EMPTY);
        }

        this.kind = kind;
    }

    protected void setKilograms(int kilograms) {
        this.kilograms = kilograms;
    }

    private void setPrice(double price) {

        if (price <= 0) {
            throw new IllegalArgumentException(ROBOT_PRICE_CANNOT_BE_BELOW_OR_EQUAL_TO_ZERO);
        }

        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getKilograms() {
        return this.kilograms;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void eating() {

    }
}
