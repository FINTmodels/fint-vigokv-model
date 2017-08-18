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
public class Hovedomrader {
	public enum Relasjonsnavn {
			HOVEDOMRADE,
			KOMPETANSEMAL
	}

	private String beskrivelse;
	private Identifikator kode;
	private String navn;
	private Identifikator PSI;
	}

