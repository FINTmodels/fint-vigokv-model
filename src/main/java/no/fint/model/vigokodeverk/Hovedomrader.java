// Built from tag v2.6.0-rc-1

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
public class Hovedomrader implements FintMainObject {
    public enum Relasjonsnavn {
            GREP,
            KOMPETANSEMALSETT,
            LAREPLAN,
            KOMPETANSEMAL
    }

    @NonNull
    private String beskrivelse;
    private Identifikator kode;
    @NonNull
    private String navn;
    @NonNull
    private Identifikator PSI;
}
