package pl.sda.OrangeJavaPL2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.OrangeJavaPL2.entity.Bread;

import java.math.BigDecimal;


public interface IBreadRepository extends JpaRepository<Bread,Long> {
// Long => long
// Integer => int

    Bread findByName(String name);

    //    Bread findBreadsBy - custom FindBy
    @Query(value = "UPDATE Bread SET name = :name, price = :price, bread_type = :type WHERE id = :id")
    @Modifying
    @Transactional // all or nothing
    void updateBread(@Param("id") Long id,
                     @Param("name") String name,
                     @Param("price") BigDecimal price,
                     @Param("type") String type);
    // Select * from users where name = [ AND 1=1x; DROP users]; -> SQL Injection



//    name [ or 1=1; drop users;]
}