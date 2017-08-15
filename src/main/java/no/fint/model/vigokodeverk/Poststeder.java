package no.fint.model.vigokodeverk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Poststeder {
    public enum Relasjonsnavn {
        KOMMUNENUMMER
    }

    private String gyldigFoM;
    private String gyldigToM;
    private String kommunenummer;
    private String postnummer;
    private String poststed;
}

