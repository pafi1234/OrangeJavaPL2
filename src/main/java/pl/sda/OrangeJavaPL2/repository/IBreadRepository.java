package pl.sda.OrangeJavaPL2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import pl.sda.OrangeJavaPL2.entity.Bread;

public interface IBreadRepository extends JpaRepository<Bread,Long> {

}