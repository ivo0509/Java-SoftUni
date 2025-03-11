package _11_JavaOOPExam_09April2022.fairyShop.models;

import static _11_JavaOOPExam_09April2022.fairyShop.common.ExceptionMessages.INSTRUMENT_POWER_LESS_THAN_ZERO;

public class InstrumentImpl implements Instrument {

    private int power;

    public InstrumentImpl(int power) {
        setPower(power);
    }

    private void setPower(int power) {

        if (power < 0) {
            throw new IllegalArgumentException(INSTRUMENT_POWER_LESS_THAN_ZERO);
        }

        this.power = power;
    }

    @Override
    public int getPower() {
        return this.power;
    }

    @Override
    public void use() {

        this.power -= 10;

        if (this.power < 0) {
            this.power = 0;
        }
    }

    @Override
    public boolean isBroken() {
        return this.power == 0;
    }
}
