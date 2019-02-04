// Built from tag v3.2.0-rc-3

package no.fint.model.vigokodeverk;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintMainObject;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Lareplaner implements FintMainObject {
    public enum Relasjonsnavn {
            GREP,
            MERKELAPP,
            ERSTATTER,
            HOVEDOMRADE,
            KOMPETANSEMALSETT,
            PROGRAMOMRADE
    }

    @NonNull
    private String dokumentreferanse;
    @NonNull
    private String formal;
    @NonNull
    private String forsteEksamen;
    @NonNull
    private String grunnleggendeFerdighetBeskrivelse;
    @NonNull
    private String grunnleggendeFerdighetDigitaleVerktoy;
    @NonNull
    private String grunnleggendeFerdighetFritekst;
    @NonNull
    private String grunnleggendeFerdighetLese;
    @NonNull
    private String grunnleggendeFerdighetMuntlig;
    @NonNull
    private String grunnleggendeFerdighetRegne;
    @NonNull
    private String grunnleggendeFerdighetSkriftlig;
    @NonNull
    private String gyldigFra;
    @NonNull
    private String gyldigTil;
    @NonNull
    private String hovedomraderIFaget;
    @NonNull
    private String hovedomraderInnledning;
    @NonNull
    private String hovedomraderOverskrift;
    @NonNull
    private Identifikator kode;
    private String kompetansemalInnledning;
    @NonNull
    private String navn;
    @NonNull
    private Identifikator PSI;
    @NonNull
    private String sisteEksamen;
    @NonNull
    private String sprak;
    @NonNull
    private String struktur;
    @NonNull
    private String timetall;
    @NonNull
    private String utgatt;
    @NonNull
    private String vurderingIFaget;
}
