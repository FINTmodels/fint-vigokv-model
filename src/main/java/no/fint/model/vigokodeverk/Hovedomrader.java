// Built from tag feature-vigokv

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
public class Hovedomrader {
	public enum Relasjonsnavn {
			GREP,
			KOMPETANSEMALSETT,
			LAREPLAN,
			KOMPETANSEMAL
	}

	private String beskrivelse;
	private Identifikator kode;
	private String navn;
	private Identifikator PSI;
	}

