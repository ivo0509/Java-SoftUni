package _08_JavaOOPRetakeExam_22August2021.glacialExpedition.models.states;

import java.util.ArrayList;
import java.util.Collection;

import static _08_JavaOOPRetakeExam_22August2021.glacialExpedition.common.ExceptionMessages.STATE_NAME_NULL_OR_EMPTY;

public class StateImpl implements State {

    private String name;
    private Collection<String> exhibits;

    public StateImpl(String name) {
        setName(name);
        this.exhibits = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(STATE_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public Collection<String> getExhibits() {
        return this.exhibits;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
