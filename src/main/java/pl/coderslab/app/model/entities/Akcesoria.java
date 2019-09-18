package pl.coderslab.app.model.entities;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "akcesoria_i_chemia")


public class Akcesoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nazwa obowiązkowa")
    @Column(name = "nazwa")
    @Size(min = 3, max = 35)
    private String name;

    @NotBlank(message = "Dzielnica obowiązkowa")
    @Column(name = "dzielnica")
    private String dzielnica;

    @NotBlank(message = "Ulica i numer lokalu")
    @Size(min = 5, max = 30)
    @Column(name = "adres")
    private String adress;

      @NotBlank(message = "Rodzaje akcesoriów")
    @Column(name = "opis")
    private String description;

    public Akcesoria(String name, String dzielnica, String adress, String description) {
        this.name = name;
        this.dzielnica = dzielnica;
        this.adress = adress;
        this.description = description;
    }

    public Akcesoria () {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDzielnica() {
        return dzielnica;
    }

    public void setDzielnica(String dzielnica) {
        this.dzielnica = dzielnica;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Akcesoria{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dzielnica='" + dzielnica + '\'' +
                ", adress='" + adress + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
