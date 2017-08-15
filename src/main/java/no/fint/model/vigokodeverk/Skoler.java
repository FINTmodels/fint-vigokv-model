package no.fint.model.vigokodeverk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Skoler {
    public enum Relasjonsnavn {
        FYLKESNUMMER,
        KOMMUNENUMMER,
        POSTNUMMER
    }

    private String epostadresse;
    private String fylkesnummer;
    private String gateadresse;
    private String gyldigFoM;
    private String gyldigToM;
    private String kommunenummer;
    private String navn;
    private String nummer;
    private String organisasjonsnummer;
    private String postadresse;
    private String postnummer;
    private String privatskole;
    private String skoleeier;
    private String skoletype;
    private String telefaks;
    private String telefon;
    private String webadresse;
}

