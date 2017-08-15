package no.fint.model.vigokodeverk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Kompetansemal {
    public enum Relasjonsnavn {
        HOVEDOMRADE,
        KOMPETANSEMALSETT
    }

    private String gammelKode;
    private String kode;
    private String navn;
    private Identifikator PSI;
}

