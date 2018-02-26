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
public class Utdanningsprogrammer implements FintMainObject {
    public enum Relasjonsnavn {
            GREP,
            ERSTATTER,
            PROGRAMOMRADE
    }

    @NonNull
    private String beskrivelse;
    @NonNull
    private String forsteSemester;
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
    private String navnFransk;
    @NonNull
    private String navnKortform;
    @NonNull
    private String navnKortformEngelsk;
    @NonNull
    private String navnKortformNynorsk;
    @NonNull
    private String navnKortformSamisk;
    @NonNull
    private String navnLangt;
    @NonNull
    private String navnNynorsk;
    @NonNull
    private String navnSamisk;
    @NonNull
    private String navnSpansk;
    @NonNull
    private String navnTysk;
    @NonNull
    private Identifikator PSI;
    @NonNull
    private String sisteSemester;
    @NonNull
    private String tidligereBetegnelse;
    @NonNull
    private String typeUtdanningsprogram;
    @NonNull
    private String utgatt;
}
