package pl.coderslab.app.model.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.app.model.entities.Drogeria;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class DrogerieDao {
    @PersistenceContext
    private EntityManager em;

    public void create(Drogeria drogeria) {
        em.persist(drogeria);
    }
        public void update(Drogeria drogeria) {
        em.merge(drogeria);
    }

        public Drogeria findById(Long id) {
        return em.find(Drogeria.class, id);
    }

        public void remove(Drogeria drogeria) {
        em.remove(em.contains(drogeria) ? drogeria : em.merge(drogeria));
    }
    public List<Drogeria> findAll() {
        return em.createQuery("SELECT d FROM Drogeria d", Drogeria.class).getResultList();
    }
}

