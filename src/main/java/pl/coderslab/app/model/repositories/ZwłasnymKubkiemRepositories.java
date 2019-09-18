package pl.coderslab.app.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.app.model.entities.Akcesoria;
import pl.coderslab.app.model.entities.ZwłasnymKubkiem;

import java.util.List;

public interface ZwłasnymKubkiemRepositories extends JpaRepository <ZwłasnymKubkiemRepositories, Long> {
    List<ZwłasnymKubkiem> findZwłasnymKubkiemByDzielnica(String dzielnica);
}
