// Built from tag v2.7.0

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
public class Fagmerknader implements FintMainObject {
    public enum Relasjonsnavn {
            GREP
    }

    @NonNull
    private String fagskolen;
    @NonNull
    private String grunnskole;
    @NonNull
    private String gyldigFoM;
    @NonNull
    private String gyldigToM;
    @NonNull
    private Identifikator kode;
    @NonNull
    private String navn;
    @NonNull
    private String navnBokmal;
    @NonNull
    private String navnEngelsk;
    @NonNull
    private String navnKortform;
    @NonNull
    private String navnKortformEngelsk;
    @NonNull
    private String navnKortformNynorsk;
    @NonNull
    private String navnKortformSamisk;
    @NonNull
    private String navnNynorsk;
    @NonNull
    private String navnSamisk;
    @NonNull
    private Identifikator PSI;
    @NonNull
    private String sistEndret;
    @NonNull
    private String standardkommentarVitnemalType;
    @NonNull
    private String utgatt;
    @NonNull
    private String videregaende;
}
