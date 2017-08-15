package no.fint.model.vigokodeverk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Karakterer {
    private String beskrivelse;
    private String gyldigFoM;
    private String gyldigToM;
    private String kode;
    private String konverteres;
    private String teller;
    private String type;
    private String verdi;
}

