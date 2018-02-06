// Built from tag v2.4.0

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
public class Poststeder implements FintMainObject {
    public enum Relasjonsnavn {
            KOMMUNENUMMER
    }

    @NonNull
    private String gyldigFoM;
    @NonNull
    private String gyldigToM;
    @NonNull
    private String kommunenummer;
    @NonNull
    private Identifikator postnummer;
    @NonNull
    private String poststed;
}
