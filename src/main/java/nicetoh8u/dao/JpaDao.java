package nicetoh8u.dao;

import nicetoh8u.model.Spitter;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository("jpaDao")
@Transactional
public class JpaDao {


    @PersistenceContext
    private EntityManager em; // Для внедрения EntityManager

    public EntityManager getEm() {
        return em;
    }

    public void addSpitter(Spitter spitter) {
       em.persist(spitter); // Использование EntityManager
    }

    @Cacheable("customer")
    public Spitter getSpitterById(long id) {
        return em.find(Spitter.class, id); // Использование EntityManager
    }

    public void deleteSpitter(Spitter spitter) {
        em.remove(em.contains(spitter) ? spitter : em.merge(spitter));
    }
}

