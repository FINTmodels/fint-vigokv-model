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
public class Fagmerknader implements FintMainObject {
	public enum Relasjonsnavn {
			GREP
	}

	private String fagskolen;
	private String grunnskole;
	private String gyldigFoM;
	private String gyldigToM;
	private Identifikator kode;
	private String navn;
	private String navnBokmal;
	private String navnEngelsk;
	private String navnKortform;
	private String navnKortformEngelsk;
	private String navnKortformNynorsk;
	private String navnKortformSamisk;
	private String navnNynorsk;
	private String navnSamisk;
	private Identifikator PSI;
	private String sistEndret;
	private String standardkommentarVitnemalType;
	private String utgatt;
	private String videregaende;
	}
