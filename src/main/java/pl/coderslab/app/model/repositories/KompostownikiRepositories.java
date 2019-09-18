package pl.coderslab.app.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.app.model.entities.Akcesoria;
import pl.coderslab.app.model.entities.Kompostowniki;

import java.util.List;

public interface KompostownikiRepositories extends JpaRepository <Kompostowniki, Long> {
    List<Kompostowniki> findKompostownikiByDzielnica (String dzielnica);
}
