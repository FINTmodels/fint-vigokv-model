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
public class Kommuner implements FintMainObject {
    public enum Relasjonsnavn {
            FYLKESNUMMER
    }

    @NonNull
    private String fylkesnummer;
    @NonNull
    private String gyldigFoM;
    @NonNull
    private String gyldigToM;
    @NonNull
    private Identifikator kommunenummer;
    @NonNull
    private String navn;
}
