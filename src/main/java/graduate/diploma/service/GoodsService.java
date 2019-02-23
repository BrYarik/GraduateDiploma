package graduate.diploma.service;

import graduate.diploma.dao.GoodsRepository;
import graduate.diploma.domain.Goods;
import graduate.diploma.domain.Manufacturer;
import graduate.diploma.domain.Model;
import graduate.diploma.domain.Picture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GoodsService {
    @Autowired
    private GoodsRepository goodsRepository;

    @Transactional
    public void addGoods(Goods goods) {
        goodsRepository.save(goods);
    }

    @Transactional
    public void deleteGoodsById(long id) {
        goodsRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<Goods> findAllGoods() {
        return goodsRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Goods findByNameAndManufacturer(String name, Manufacturer manufacturer) {
        return goodsRepository.findByNameAndManufacturer(name, manufacturer);
    }

    @Transactional(readOnly = true)
    public Model findByManufacturerAndName(Manufacturer manufacturer, Goods goods) {
        return goodsRepository.findByManufacturerAndName(manufacturer, goods.getName());
    }

    @Transactional(readOnly = true)
    public List<Goods> findByYear(int year) {
        return goodsRepository.findByYear(year);
    }

    @Transactional(readOnly = true)
    public List<Goods> findByYearBetween(int yearStart, int yearEnd) {
        return goodsRepository.findByYearBetween(yearStart, yearEnd);
    }

    @Transactional(readOnly = true)
    public List<Goods> findByPriceBetween(double priceStart, double priceEnd) {
        return goodsRepository.findByPriceBetween(priceStart, priceEnd);
    }

    @Transactional(readOnly = true)
    public Picture findByNameAndModelAndManufacturerAndYear(Goods goods, Model model, Manufacturer manufacturer, int year) {
        return goodsRepository.findByNameAndModelAndManufacturerAndYear(goods.getName(), model, manufacturer, year);
    }

    @Transactional(readOnly = true)
    public Manufacturer findByNameAndModelAndYear(Goods goods, Model model, int year) {
        return goodsRepository.findByNameAndModelAndYear(goods.getName(), model, year);
    }

    @Transactional(readOnly = true)
    public List<Goods> findByManufacturer(Manufacturer manufacturer) {
        return goodsRepository.findByManufacturer(manufacturer);
    }

    @Transactional(readOnly = true)
    public List<Goods> findByPrice(double price) {
        return goodsRepository.findByPrice(price);
    }

    @Transactional(readOnly = true)
    public long countByModels(Model model) {
        return goodsRepository.countByModel(model);
    }

    @Transactional(readOnly = true)
    public long countByManufacturer(Manufacturer manufacturer) {
        return goodsRepository.countByManufacturer(manufacturer);
    }

    @Transactional(readOnly = true)
    public long countByManufacturerAndModel(Manufacturer manufacturer, Model model) {
        return goodsRepository.countByManufacturerAndModel(manufacturer, model);
    }

    @Transactional(readOnly = true)
    public long countByYear(int year) {
        return goodsRepository.countByYear(year);
    }

    @Transactional(readOnly = true)
    public long countByYearBetween(int yearStart, int yearEnd) {
        return goodsRepository.countByYearBetween(yearStart, yearEnd);
    }

    @Transactional(readOnly = true)
    public long countByPriceBetween(double priceStart, double priceEnd) {
        return goodsRepository.countByPriceBetween(priceStart, priceEnd);
    }

    @Transactional(readOnly = true)
    public long countAll() {
        return goodsRepository.count();
    }
}
