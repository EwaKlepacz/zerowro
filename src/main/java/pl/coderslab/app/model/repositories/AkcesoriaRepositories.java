package pl.coderslab.app.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.app.model.entities.Akcesoria;

import java.util.List;

public interface AkcesoriaRepositories extends JpaRepository <Akcesoria, Long> {

    List<Akcesoria> findAkcesoriaByDzielnice (String dzielnice);
}
