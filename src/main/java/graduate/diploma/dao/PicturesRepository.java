package graduate.diploma.dao;

import graduate.diploma.domain.Goods;
import graduate.diploma.domain.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PicturesRepository extends JpaRepository<Picture, Long> {
    Picture findByGoods(Goods goods);
}
