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
public class Kompetansemalsett implements FintMainObject {
	public enum Relasjonsnavn {
			GREP,
			KOMPETANSEMAL,
			LAREPLAN,
			HOVEDOMRADE,
			FAG
	}

	private Identifikator kode;
	private String navn;
	private Identifikator PSI;
	private String arstrinn;
	}
