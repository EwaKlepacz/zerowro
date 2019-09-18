package pl.coderslab.app.model.entities;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Kompostowniki")
public class Kompostowniki {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nazwa")
    @Size(min = 4, max = 30, message = "Długośc tekstu pomiędzy 4, a 30 znaków")
    private String nazwa;

    @Column(name = "dzielnica")
    @NotBlank
    @Size(min = 5, max = 30, message = "Długośc tekstu pomiędzy 5, a 30 znaków")
    private String dzielnica;

    @Column(name = "adres")
    @NotBlank(message = "Adres w formie: ulica + numer")
    private String adress;


    @Column(name = "kontakt")
    @NotBlank(message = "Długość testu powiędzy 5, a 30 znaków, sugerowany kontakt telefoniczny lub mailowy")
    @Size(min = 5, max=30)
    private String kontakt;

    public Kompostowniki(String nazwa, String dzielnica, String adress, String kontakt) {
        this.nazwa = nazwa;
        this.dzielnica = dzielnica;
        this.adress = adress;
        this.kontakt = kontakt;
    }

    public Kompostowniki () {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
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

    public String getKontakt() {
        return kontakt;
    }

    public void setKontakt(String kontakt) {
        this.kontakt = kontakt;
    }

    @Override
    public String toString() {
        return "Kompostowniki{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", dzielnica='" + dzielnica + '\'' +
                ", adress='" + adress + '\'' +
                ", kontakt='" + kontakt + '\'' +
                '}';
    }
}
