package graduate.diploma.service;

import graduate.diploma.dao.CategoryRepository;
import graduate.diploma.domain.Category;
import graduate.diploma.domain.Manufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    @Transactional
    public void deleteCategoryById(long id) {
        categoryRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Category findByName(String name) {
        return categoryRepository.findByName(name);
    }

    @Transactional(readOnly = true)
    public List<Manufacturer> findAllManufacturersByCategoryName(Category category) {
        return categoryRepository.findAllByName(category.getName());
    }

    @Transactional(readOnly = true)
    public long countManufacturersByCategoryName(Category category) {
        return categoryRepository.countByName(category.getName());
    }
}
