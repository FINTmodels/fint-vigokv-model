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
public class Utdanningsprogrammer {
    public enum Relasjonsnavn {
        ERSTATTER,
        PROGRAMOMRADE
    }

    private String beskrivelse;
    private String forsteSemester;
    private String gyldigFoM;
    private String gyldigToM;
    private String kode;
    private String navn;
    private String navnBokmal;
    private String navnEngelsk;
    private String navnFransk;
    private String navnKortform;
    private String navnKortformEngelsk;
    private String navnKortformNynorsk;
    private String navnKortformSamisk;
    private String navnLangt;
    private String navnNynorsk;
    private String navnSamisk;
    private String navnSpansk;
    private String navnTysk;
    private Identifikator PSI;
    private String sisteSemester;
    private String tidligereBetegnelse;
    private String typeUtdanningsprogram;
    private String utgatt;
}

