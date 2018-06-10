// Built from tag v3.0.0

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
public class Merkelapper implements FintMainObject {
    public enum Relasjonsnavn {
            GREP
    }

    private Identifikator kode;
    @NonNull
    private String navn;
    @NonNull
    private Identifikator PSI;
}
