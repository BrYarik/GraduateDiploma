package graduate.diploma.service;

import graduate.diploma.dao.PicturesRepository;
import graduate.diploma.domain.Goods;
import graduate.diploma.domain.Picture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PictureService {
    @Autowired
    private PicturesRepository picturesRepository;

    @Transactional
    public void addPictures(Picture picture) {
        picturesRepository.save(picture);
    }

    @Transactional
    public void deleteById(long id) {
        picturesRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<Picture> findAll() {
        return picturesRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Picture findByGoods(Goods goods) {
        return picturesRepository.findByGoods(goods);
    }
}
