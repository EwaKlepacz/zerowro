package pl.coderslab.app.model.dao;


import org.springframework.stereotype.Repository;
import pl.coderslab.app.model.entities.Kompostowniki;
import javax.transaction.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class KompostownikiDao {

    @PersistenceContext
    private EntityManager em;

    public void create(Kompostowniki kompostowniki) {
        em.persist(kompostowniki);
    }

    public void update(Kompostowniki kompostowniki) {
        em.merge(kompostowniki);
    }

    public Kompostowniki findById(Long id) {
        return em.find(Kompostowniki.class, id);
    }

    public void remove(Kompostowniki kompostowniki) {
        em.remove(em.contains(kompostowniki) ? kompostowniki : em.merge(kompostowniki));
    }
    public List<Kompostowniki> findAll() {
        return em.createQuery("SELECT k FROM Kompostowniki k", Kompostowniki.class).getResultList();
    }


}