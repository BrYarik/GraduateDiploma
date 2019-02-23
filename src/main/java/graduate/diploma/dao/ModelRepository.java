package graduate.diploma.dao;

import graduate.diploma.domain.Goods;
import graduate.diploma.domain.Manufacturer;
import graduate.diploma.domain.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModelRepository extends JpaRepository<Model, Long> {
    List<Model> findByManufacturer(Manufacturer manufacturer);

    List<Goods> findByName(String name);
}