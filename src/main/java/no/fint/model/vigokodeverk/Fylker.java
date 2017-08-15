package no.fint.model.vigokodeverk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Fylker {
    private String fylkesnummer;
    private String gyldigFoM;
    private String gyldigToM;
    private String kortnavn;
    private String langnavn;
    private String navn;
    private String skolear;
    private String termin;
}

