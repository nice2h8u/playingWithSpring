package nicetoh8u.service.impl;

import nicetoh8u.dao.JpaDao;
import nicetoh8u.model.Spitter;
import nicetoh8u.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    JpaDao jpaDao;

    public void saveItem(Spitter spitter) {
        jpaDao.addSpitter(spitter);
    }

    public Spitter getSpitter(Long id) {
        return jpaDao.getSpitterById(id);
    }

    public void deleteItem(Spitter spitter) {
        jpaDao.deleteSpitter(spitter);
    }
}
