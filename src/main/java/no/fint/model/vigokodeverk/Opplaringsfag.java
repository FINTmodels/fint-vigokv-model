// Built from tag v3.2.0

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
public class Opplaringsfag implements FintMainObject {
    public enum Relasjonsnavn {
            STANDARDKOMMENTAR,
            FAGTYPE,
            GREP,
            KOMPETANSEMALSETT,
            MERKELAPP,
            ERSTATTER,
            DELFAG,
            TILHORERPROGRAMOMRADE
    }

    private String delfag;
    @NonNull
    private String eksamensVurderingElev;
    @NonNull
    private String eksamensVurderingPrivatist;
    @NonNull
    private String elevtgrl;
    @NonNull
    private String fagskolen;
    @NonNull
    private String fagtype;
    @NonNull
    private String forsteEksamen;
    @NonNull
    private String forstUndervist;
    @NonNull
    private String gammelFagkode;
    @NonNull
    private String gyldigFoM;
    @NonNull
    private String gyldigToM;
    @NonNull
    private String hjelpemiderSentralEksamen;
    @NonNull
    private String hjelpemidler;
    @NonNull
    private String importer;
    @NonNull
    private Identifikator kode;
    @NonNull
    private String merknad;
    @NonNull
    private String navn;
    @NonNull
    private String navnBokmal;
    @NonNull
    private String navnEngelsk;
    @NonNull
    private String navnFransk;
    @NonNull
    private String navnKortform;
    @NonNull
    private String navnKortformEngelsk;
    @NonNull
    private String navnKortformNynorsk;
    @NonNull
    private String navnKortformSamisk;
    @NonNull
    private String navnLangt;
    @NonNull
    private String navnNynorsk;
    @NonNull
    private String navnSamisk;
    @NonNull
    private String navnSpansk;
    @NonNull
    private String navnTysk;
    @NonNull
    private String nettoOmfang;
    @NonNull
    private String omfangVitnemal;
    @NonNull
    private String oppgavetype;
    @NonNull
    private Identifikator PSI;
    @NonNull
    private String sensurtype;
    @NonNull
    private String sisteEksamen;
    @NonNull
    private String sistUndervist;
    @NonNull
    private String standardKommentar;
    @NonNull
    private String totaltOmfang;
    @NonNull
    private String tverrfag;
    @NonNull
    private String utenStandpunkt;
    @NonNull
    private String utgatt;
    @NonNull
    private String arstimerStatistikk;
}
