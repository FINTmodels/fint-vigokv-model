// Built from tag v3.1.0-rc-1

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
public class Kompetansemalsett implements FintMainObject {
    public enum Relasjonsnavn {
            GREP,
            KOMPETANSEMAL,
            LAREPLAN,
            HOVEDOMRADE,
            FAG
    }

    private Identifikator kode;
    @NonNull
    private String navn;
    @NonNull
    private Identifikator PSI;
    @NonNull
    private String arstrinn;
}
