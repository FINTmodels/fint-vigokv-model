// Built from tag v2.4.0-rc-3

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
public class Programomrader implements FintMainObject {
    public enum Relasjonsnavn {
            FAGUNDERPROGRAMOMRADE,
            GREP,
            LAREPLAN,
            MERKELAPP,
            OPPLARINGSFAGUNDERPROGRAMOMRADE,
            PROGRAMOMRADEKATEGORI,
            VARIANTAVPROGRAMOMRADE,
            ERSTATTER,
            UTDANNINGSPROGRAM
    }

    @NonNull
    private String apo;
    @NonNull
    private String avsluttendeKompetanse;
    @NonNull
    private String beskrivelse;
    @NonNull
    private String fstype;
    @NonNull
    private String forsteSemester;
    @NonNull
    private String gyldigFoM;
    @NonNull
    private String gyldigToM;
    @NonNull
    private String importer;
    @NonNull
    private String kanVareLandslinje;
    @NonNull
    private Identifikator kode;
    @NonNull
    private String landsdekkendeLinje;
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
    private String niva;
    @NonNull
    private String nuskode;
    @NonNull
    private String poengberegnes;
    @NonNull
    private Identifikator PSI;
    @NonNull
    private String samlekodeTAF;
    @NonNull
    private String sisteSemester;
    @NonNull
    private String type;
    @NonNull
    private String typeProgramomrade;
    @NonNull
    private String utgatt;
    @NonNull
    private String arstimer;
    @NonNull
    private String arstimerDoveTunghorte;
    @NonNull
    private String arstimerFormgivingsfag;
    @NonNull
    private String arstimerSamisk;
    @NonNull
    private String arstimerStatistikk;
    @NonNull
    private String arstrinn;
}
