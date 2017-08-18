package no.fint.model.vigokodeverk;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Poststeder {
	public enum Relasjonsnavn {
			KOMMUNENUMMER
	}

	private String gyldigFoM;
	private String gyldigToM;
	private String kommunenummer;
	private Identifikator postnummer;
	private String poststed;
	}

