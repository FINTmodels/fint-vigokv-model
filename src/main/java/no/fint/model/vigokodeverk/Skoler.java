// Built from tag v2.6.0-beta-2

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
public class Skoler implements FintMainObject {
    public enum Relasjonsnavn {
            FYLKESNUMMER,
            KOMMUNENUMMER,
            POSTNUMMER
    }

    @NonNull
    private String epostadresse;
    @NonNull
    private String fylkesnummer;
    @NonNull
    private String gateadresse;
    @NonNull
    private String gyldigFoM;
    @NonNull
    private String gyldigToM;
    @NonNull
    private String kommunenummer;
    @NonNull
    private String navn;
    @NonNull
    private Identifikator nummer;
    @NonNull
    private Identifikator organisasjonsnummer;
    @NonNull
    private String postadresse;
    @NonNull
    private String postnummer;
    @NonNull
    private String privatskole;
    @NonNull
    private String skoleeier;
    @NonNull
    private String skoletype;
    @NonNull
    private String telefaks;
    @NonNull
    private String telefon;
    @NonNull
    private String webadresse;
}
