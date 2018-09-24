// Built from tag v3.1.0

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
public class Fylker implements FintMainObject {
    @NonNull
    private Identifikator fylkesnummer;
    @NonNull
    private String gyldigFoM;
    @NonNull
    private String gyldigToM;
    @NonNull
    private String kortnavn;
    @NonNull
    private String langnavn;
    @NonNull
    private String navn;
    @NonNull
    private String skolear;
    @NonNull
    private String termin;
}
