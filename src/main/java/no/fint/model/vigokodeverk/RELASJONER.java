package no.fint.model.vigokodeverk;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class RELASJONER {
	public enum Relasjonsnavn {
			ENTITET_1,
			ENTITET_2
	}

	private String KODE_1;
	private String KODE_2;
	private String RELASJONSNAVN;
	}

