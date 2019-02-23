package graduate.diploma.dao;

import graduate.diploma.domain.Category;
import graduate.diploma.domain.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);

    List<Manufacturer> findAllByName(String name);

    long countByName(String name);
}
