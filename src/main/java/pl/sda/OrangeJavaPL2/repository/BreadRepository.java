package pl.sda.OrangeJavaPL2.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.sda.OrangeJavaPL2.entity.Bread;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BreadRepository {

    private final IBreadRepository breadRepository;

    public List<Bread> getAllBreads(){
        return breadRepository.findAll();
    }

    public void addBread(Bread bread){
        breadRepository.save(bread);
    }
}