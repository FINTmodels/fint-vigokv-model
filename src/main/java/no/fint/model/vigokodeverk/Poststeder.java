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
public class Poststeder implements FintMainObject {
	public enum Relasjonsnavn {
			KOMMUNENUMMER
	}

	private String gyldigFoM;
	private String gyldigToM;
	private String kommunenummer;
	private Identifikator postnummer;
	private String poststed;
	}
