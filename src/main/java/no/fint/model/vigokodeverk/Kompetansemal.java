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
public class Kompetansemal {
	public enum Relasjonsnavn {
			GREP,
			HOVEDOMRADE,
			KOMPETANSEMALSETT
	}

	private String gammelKode;
	private Identifikator kode;
	private String navn;
	private Identifikator PSI;
	}

