package graduate.diploma.dao;

import graduate.diploma.domain.Goods;
import graduate.diploma.domain.Manufacturer;
import graduate.diploma.domain.Model;
import graduate.diploma.domain.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.jws.WebParam;
import java.util.List;

public interface GoodsRepository extends JpaRepository<Goods, Long> {
    Goods findByNameAndManufacturer(String name, Manufacturer manufacturer);

    Model findByManufacturerAndName(Manufacturer manufacturer, String name);

    List<Goods> findByYear(int year);

    List<Goods> findByYearBetween(int yearStart, int yearEnd);

    List<Goods> findByPrice(double price);

    List<Goods> findByPriceBetween(double priceStart, double priceEnd);

    Picture findByNameAndModelAndManufacturerAndYear(String name, Model model, Manufacturer manufacturer, int year);

    Manufacturer findByNameAndModelAndYear(String name, Model model, int year);

    List<Goods> findByManufacturer(Manufacturer manufacturer);

    long countByModel(Model model);

    long countByManufacturer(Manufacturer manufacturer);

    long countByManufacturerAndModel(Manufacturer manufacturer, Model model);

    long countByYear(int year);

    long countByYearBetween(int yearStart, int yearEnd);

    long countByPriceBetween(double priceStart, double priceEnd);
}
