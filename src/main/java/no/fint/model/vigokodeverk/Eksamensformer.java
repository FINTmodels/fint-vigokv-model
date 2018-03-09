// Built from tag v2.6.0-beta-2

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
public class Eksamensformer implements FintMainObject {
    @NonNull
    private String gyldigFoM;
    @NonNull
    private String gyldigToM;
    @NonNull
    private Identifikator kode;
    @NonNull
    private String navn;
    @NonNull
    private String navnEngelsk;
    @NonNull
    private String navnFransk;
    @NonNull
    private String navnNynorsk;
    @NonNull
    private String navnSamisk;
    @NonNull
    private String navnSpansk;
    @NonNull
    private String navnTysk;
}
