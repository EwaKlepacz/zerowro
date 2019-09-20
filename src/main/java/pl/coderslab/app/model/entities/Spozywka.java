package pl.coderslab.app.model.entities;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "spozywka")
public class Spozywka {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "nazwa")
    @Size(min = 3, max = 35, message = "Długośc tekstu pomiędzy 3, a 35 znaków")
    private String name;

    @NotBlank
    @Column(name = "dzielnica")
    private String dzielnica;

    @NotBlank
    @Size(min = 5, max = 30, message = "Długośc tekstu pomiędzy 5, a 30 znaków")
    @Column(name = "adres")
    private String adress;

    @Size
    @Column(name = "typ")
    private String typ;

    @NotBlank
    @Column(name = "opis")
    private String description;

    public Spozywka(String name, String dzielnica, String adress, String marki,String typ ,String description ) {
        this.name = name;
        this.dzielnica = dzielnica;
        this.adress = adress;
        this.typ = typ;
        this.description = description;
    }
    public  Spozywka () {

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

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Spozywka{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dzielnica='" + dzielnica + '\'' +
                ", adress='" + adress + '\'' +
                ", typ='" + typ + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
