package no.fint.model.vigokodeverk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Kommuner {
    public enum Relasjonsnavn {
        FYLKESNUMMER
    }

    private String fylkesnummer;
    private String gyldigFoM;
    private String gyldigToM;
    private String kommunenummer;
    private String navn;
}

