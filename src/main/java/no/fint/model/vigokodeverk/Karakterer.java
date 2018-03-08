// Built from tag v0.99.9

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
public class Karakterer implements FintMainObject {
    @NonNull
    private String beskrivelse;
    @NonNull
    private String gyldigFoM;
    @NonNull
    private String gyldigToM;
    @NonNull
    private Identifikator kode;
    @NonNull
    private String konverteres;
    @NonNull
    private String teller;
    @NonNull
    private String type;
    @NonNull
    private String verdi;
}
