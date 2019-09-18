package pl.coderslab.app.model.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.app.model.entities.Akcesoria;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class AkcesoriaDao {

    @PersistenceContext
    private EntityManager em;

    public void create(Akcesoria akcesoria) {
        em.persist(akcesoria);
    }

    public void update(Akcesoria akcesoria) {
        em.merge(akcesoria);
    }

    public Akcesoria findById(Long id) {
        return em.find(Akcesoria.class, id);
    }

    public void remove(Akcesoria akcesoria) {
        em.remove(em.contains(akcesoria) ? akcesoria : em.merge(akcesoria));
    }
    public List<Akcesoria> findAll() {
        return em.createQuery("SELECT a FROM Akcesoria a", Akcesoria.class).getResultList();
    }

    public List<Akcesoria> findByDzielnica {

    }


}