package pl.coderslab.app.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.app.model.entities.Akcesoria;
import pl.coderslab.app.model.entities.Spozywka;

import java.util.List;

public interface SpożywkaRepositories extends JpaRepository <Spozywka, Long>{
    List<Spozywka> findSpozywkaByDzielnica (String dzielnica);
}
