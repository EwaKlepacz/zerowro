package pl.coderslab.app.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.app.model.entities.Drogeria;

import java.util.List;

public interface DrogerieRepositories extends JpaRepository<Drogeria, Long> {

    List<Drogeria> findDrogeriaByDzielnica(String dzielnica);

}



