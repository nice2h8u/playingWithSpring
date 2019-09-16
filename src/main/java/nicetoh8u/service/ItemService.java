package nicetoh8u.service;

import nicetoh8u.model.Spitter;

public interface ItemService {
    public void saveItem(Spitter spitter);
    Spitter getSpitter(Long id);
    void deleteItem(Spitter spitter);
}
