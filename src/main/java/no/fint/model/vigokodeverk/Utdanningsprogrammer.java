// Built from tag v2.2.0

package no.fint.model.vigokodeverk;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@EqualsAndHashCode
@ToString
public class Utdanningsprogrammer implements FintMainObject {
	public enum Relasjonsnavn {
			GREP,
			ERSTATTER,
			PROGRAMOMRADE
	}

	private String beskrivelse;
	private String forsteSemester;
	private String gyldigFoM;
	private String gyldigToM;
	private Identifikator kode;
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
