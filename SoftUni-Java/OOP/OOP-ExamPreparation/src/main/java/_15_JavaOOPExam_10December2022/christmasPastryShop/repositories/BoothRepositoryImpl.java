package _15_JavaOOPExam_10December2022.christmasPastryShop.repositories;

import _15_JavaOOPExam_10December2022.christmasPastryShop.entities.booths.interfaces.Booth;
import _15_JavaOOPExam_10December2022.christmasPastryShop.repositories.interfaces.BoothRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BoothRepositoryImpl implements BoothRepository<Booth> {

    private Collection<Booth> models;

    public BoothRepositoryImpl() {
        this.models = new ArrayList<>();
    }

    @Override
    public Booth getByNumber(int number) {
        return this.models
                .stream()
                .filter(e -> e.getBoothNumber() == number)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Collection<Booth> getAll() {
        return Collections.unmodifiableCollection(this.models);
    }

    @Override
    public void add(Booth booth) {
        this.models.add(booth);
    }
}
