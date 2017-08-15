package no.fint.model.vigokodeverk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Onskestatus {
    private String gyldigFoM;
    private String gyldigToM;
    private String kode;
    private String nr;
    private String tekst;
    private String type;
}

