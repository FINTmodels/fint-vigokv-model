// Built from tag v0.99.0

package no.fint.model.vigokodeverk;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Eksamensvurderinger implements FintMainObject {
    @NonNull
    private String gammelFagkode;
    @NonNull
    private String gyldigFoM;
    @NonNull
    private String gyldigToM;
    @NonNull
    private String hoyesteNiva;
    @NonNull
    private String navn;
    @NonNull
    private Identifikator PSI;
    @NonNull
    private String standpunkt;
    @NonNull
    private String typeEksamensfag;
    @NonNull
    private String typeEksamensformVitnemal;
    @NonNull
    private String typeEksamensordning;
    @NonNull
    private String typeVurderingsform;
}
