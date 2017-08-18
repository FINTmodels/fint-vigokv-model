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
public class Kommuner {
	public enum Relasjonsnavn {
			FYLKESNUMMER
	}

	private String fylkesnummer;
	private String gyldigFoM;
	private String gyldigToM;
	private Identifikator kommunenummer;
	private String navn;
	}

