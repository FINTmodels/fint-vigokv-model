package no.fint.model.vigokodeverk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Land {
    private String gyldigFoM;
    private String gyldigToM;
    private String kode;
    private String navn;
    private String navnEngelsk;
    private String navnNynorsk;
    private String nyKode;
    private String statsborgerskap;
}

