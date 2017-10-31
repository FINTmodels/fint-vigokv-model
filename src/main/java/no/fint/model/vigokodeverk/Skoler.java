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
public class Skoler implements FintMainObject {
	public enum Relasjonsnavn {
			FYLKESNUMMER,
			KOMMUNENUMMER,
			POSTNUMMER
	}

	private String epostadresse;
	private String fylkesnummer;
	private String gateadresse;
	private String gyldigFoM;
	private String gyldigToM;
	private String kommunenummer;
	private String navn;
	private Identifikator nummer;
	private Identifikator organisasjonsnummer;
	private String postadresse;
	private String postnummer;
	private String privatskole;
	private String skoleeier;
	private String skoletype;
	private String telefaks;
	private String telefon;
	private String webadresse;
	}
