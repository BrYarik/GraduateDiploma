package graduate.diploma.service;

import graduate.diploma.dao.ModelRepository;
import graduate.diploma.domain.Goods;
import graduate.diploma.domain.Manufacturer;
import graduate.diploma.domain.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ModelService {
    @Autowired
    private ModelRepository modelRepository;

    @Transactional
    public void addModel(Model model) {
        modelRepository.save(model);
    }

    @Transactional
    public void deleteModelById(long id) {
        modelRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<Model> findall() {
        return modelRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<Model> findByManufacturer(Manufacturer manufacturer) {
        return modelRepository.findByManufacturer(manufacturer);
    }

    @Transactional(readOnly = true)
    public List<Goods> findGoodsByModelName(Model model) {
        return modelRepository.findByName(model.getName());
    }

    @Transactional(readOnly = true)
    public long countAllModels() {
        return modelRepository.count();
    }
}
