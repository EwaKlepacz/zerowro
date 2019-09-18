package pl.coderslab.app.model.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.app.model.entities.Spozywka;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class SpozywkaDao {

    @PersistenceContext
    private EntityManager em;

    public void create(Spozywka spozywka) {
        em.persist(spozywka);
    }

    public void update(Spozywka spozywka) {
        em.merge(spozywka);
    }

    public Spozywka findById(Long id) {
        return em.find(Spozywka.class, id);
    }

    public void remove(Spozywka spozywka) {
        em.remove(em.contains(spozywka) ? spozywka : em.merge(spozywka));
    }

    public List<Spozywka> findAll() {
        return em.createQuery("SELECT s FROM Spozywka s", Spozywka.class).getResultList();
    }
}