package com.example.voorbeeldexamen1.model;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class Persoon {

    @Id
    private String veilingpersoonnummer;
    @NotBlank
    private String naam;
    @Email
    @UniqueElements
    private String Email;


    public Persoon() {
    }

    public Persoon(String veilingpersoonnummer, String naam, String email) {
        this.veilingpersoonnummer = veilingpersoonnummer;
        this.naam = naam;
        Email = email;
    }

    public String getVeilingpersoonnummer() {
        return veilingpersoonnummer;
    }

    public void setVeilingpersoonnummer(String veilingpersoonnummer) {
        this.veilingpersoonnummer = veilingpersoonnummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {

        this.naam = naam;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
