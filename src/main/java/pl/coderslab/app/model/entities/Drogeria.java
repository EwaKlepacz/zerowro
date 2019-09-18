package pl.coderslab.app.model.entities;


import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "drogerie")

public class Drogeria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nazwa obowiązkowa")
    @Column(name = "nazwa")
    @Size(min = 3, max = 35)
    private String name;

    @NotBlank(message = "Nazwa dzielnicy obowiązkowa")
    @Column(name = "dzielnica")
    private String dzielnica;

    @NotBlank(message = "Nazwa obowiązkowa, długość tekstu pomiędzy 5 a 30 znaków")
    @Size(min = 5, max = 30)
    @Column(name = "adres")
    private String adress;


    @Column(name = "marki")
    private String marki;

    @NotBlank(message = "Opis obowiązkowy, powinien zawierać typy kosmetyków")
    @Column(name = "opis")
    private String description;

    public Drogeria(String name, String dzielnica, String adress, String marki, String description) {
        this.name = name;
        this.dzielnica = dzielnica;
        this.adress = adress;
        this.marki = marki;
        this.description = description;
    }

    public Drogeria () {

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

    public String getMarki() {
        return marki;
    }

    public void setMarki(String marki) {
        this.marki = marki;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Drogeria{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dzielnica='" + dzielnica + '\'' +
                ", adress='" + adress + '\'' +
                ", marki='" + marki + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
