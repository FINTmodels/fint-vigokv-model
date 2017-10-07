// Built from tag feature-vigokv

package no.fint.model.vigokodeverk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Programomrader {
	public enum Relasjonsnavn {
			FAGUNDERPROGRAMOMRADE,
			GREP,
			LAREPLAN,
			MERKELAPP,
			OPPLARINGSFAGUNDERPROGRAMOMRADE,
			PROGRAMOMRADEKATEGORI,
			VARIANTAVPROGRAMOMRADE,
			ERSTATTER,
			UTDANNINGSPROGRAM
	}

	private String apo;
	private String avsluttendeKompetanse;
	private String beskrivelse;
	private String fstype;
	private String forsteSemester;
	private String gyldigFoM;
	private String gyldigToM;
	private String importer;
	private String kanVareLandslinje;
	private Identifikator kode;
	private String landsdekkendeLinje;
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
	private String niva;
	private String nuskode;
	private String poengberegnes;
	private Identifikator PSI;
	private String samlekodeTAF;
	private String sisteSemester;
	private String type;
	private String typeProgramomrade;
	private String utgatt;
	private String arstimer;
	private String arstimerDoveTunghorte;
	private String arstimerFormgivingsfag;
	private String arstimerSamisk;
	private String arstimerStatistikk;
	private String arstrinn;
	}

