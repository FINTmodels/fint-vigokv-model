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
public class Kompetansemalsett {
	public enum Relasjonsnavn {
			KOMPETANSEMAL,
			LAREPLAN,
			FAG
	}

	private String navn;
	private Identifikator PSI;
	private String arstrinn;
	}

