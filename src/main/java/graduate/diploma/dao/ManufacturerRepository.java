package graduate.diploma.dao;

import graduate.diploma.domain.Category;
import graduate.diploma.domain.Goods;
import graduate.diploma.domain.Manufacturer;
import graduate.diploma.domain.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {
    List<Model> findByName(String name);

    List<Goods> findByNameAndModels(String name, Model models);

    Manufacturer findByModels(Model models);

    List<Model> findByNameAndCategories(String name, Category categories);

}
