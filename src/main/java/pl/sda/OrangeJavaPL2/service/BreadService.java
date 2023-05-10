package pl.sda.OrangeJavaPL2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.sda.OrangeJavaPL2.entity.Bread;
import pl.sda.OrangeJavaPL2.repository.BreadRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BreadService {

    private final BreadRepository breadRepository;

    public List<Bread> getAllBreads() {
        return breadRepository.getAllBreads();
    }


    public ResponseEntity addBread(Bread bread) {
        if (bread == null) {
            return ResponseEntity
                    .status(404)
                    .build();
        } else if (bread.getName().equals("kajzerka")) {
            throw new IllegalArgumentException("ByczQ, kajzerka to na niedziele");
        } else {
            breadRepository.addBread(bread);
            return ResponseEntity
                    .status(201)
                    .build();
        }
    }

    public void deleteBreadById(Long id) {
        breadRepository.deleteBreadById(id);
    }

    public void updateBread(Long id, String name, BigDecimal price, String type) {
        breadRepository.updateBread(id, name, price, type);
    }

    public Optional<Bread> getBreadById(Long id) {
        return breadRepository.getBreadById(id);
    }
}
