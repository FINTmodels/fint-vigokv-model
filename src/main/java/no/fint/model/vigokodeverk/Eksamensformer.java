package no.fint.model.vigokodeverk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Eksamensformer {
    private String gyldigFoM;
    private String gyldigToM;
    private String kode;
    private String navn;
    private String navnEngelsk;
    private String navnFransk;
    private String navnNynorsk;
    private String navnSamisk;
    private String navnSpansk;
    private String navnTysk;
}

