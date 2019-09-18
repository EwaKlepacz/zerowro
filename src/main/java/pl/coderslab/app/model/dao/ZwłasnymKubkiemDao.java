package pl.coderslab.app.model.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.app.model.entities.Akcesoria;
import pl.coderslab.app.model.entities.ZwłasnymKubkiem;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public class ZwłasnymKubkiemDao {

    @PersistenceContext
    private EntityManager em;

    public void create(ZwłasnymKubkiem zwłasnymKubkiem) {
        em.persist(zwłasnymKubkiem);
    }

    public void update(ZwłasnymKubkiem zwłasnymKubkiem) {
        em.merge(zwłasnymKubkiem);
    }

    public ZwłasnymKubkiem findById(Long id) {
        return em.find(ZwłasnymKubkiem.class, id);
    }

    public void remove(ZwłasnymKubkiem zwłasnymKubkiem) {
        em.remove(em.contains(zwłasnymKubkiem) ? zwłasnymKubkiem : em.merge(zwłasnymKubkiem));
    }

    public List<ZwłasnymKubkiem> findAll() {
        return em.createQuery("SELECT z FROM ZwłasnymKubkiem z", ZwłasnymKubkiem.class).getResultList();
    }
}


