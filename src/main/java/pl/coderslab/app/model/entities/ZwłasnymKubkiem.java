package pl.coderslab.app.model.entities;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="Z_własnym_kubkiem")

public class ZwłasnymKubkiem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nazwa")
    @NotBlank
    @Size(min = 3, max = 35, message = "Nazwa powinna posiadać powiedzy 3 a 35 znaków")
    private String nazwa;


    @Column(name = "dzielnica")
    @NotBlank
    private String dzielnica;

    @NotBlank
    @Size(min = 5, max = 30, message = "Nazwa powinna posiadać powiedzy 5 a 30 znaków")
    @Column(name = "adres")
    private String adress;


    public ZwłasnymKubkiem(String nazwa, String dzielnica, String adress) {
        this.nazwa = nazwa;
        this.dzielnica = dzielnica;
        this.adress = adress;
    }

    public ZwłasnymKubkiem () {

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

    @Override
    public String toString() {
        return "ZwłasnymKubkiem{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", dzielnica='" + dzielnica + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
