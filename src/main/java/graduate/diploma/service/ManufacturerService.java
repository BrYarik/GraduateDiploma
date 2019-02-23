package graduate.diploma.service;

import graduate.diploma.dao.ManufacturerRepository;
import graduate.diploma.domain.Category;
import graduate.diploma.domain.Goods;
import graduate.diploma.domain.Manufacturer;
import graduate.diploma.domain.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class ManufacturerService {
    @Autowired
    private ManufacturerRepository manufacturerRepository;

    @Transactional
    public void addManufacturer(Manufacturer manufacturer) {
        manufacturerRepository.save(manufacturer);
    }

    @Transactional
    public void deleteManufacturerById(long id) {
        manufacturerRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<Manufacturer> findAll() {
        return manufacturerRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Manufacturer findByModels(Model models) {
        return manufacturerRepository.findByModels(models);
    }

    @Transactional(readOnly = true)
    public List<Model> findModelsByManufacturerName(Manufacturer manufacturer) {
        return manufacturerRepository.findByName(manufacturer.getName());
    }

    @Transactional(readOnly = true)
    public List<Goods> findByManufacturerNameAndModel(Manufacturer manufacturer, Model model) {
        return manufacturerRepository.findByNameAndModels(manufacturer.getName(), model);
    }

    @Transactional(readOnly = true)
    public List<Model> findByManufacturerNameAndCategory(Manufacturer manufacturer, Category category) {
        return manufacturerRepository.findByNameAndCategories(manufacturer.getName(), category);
    }
}
