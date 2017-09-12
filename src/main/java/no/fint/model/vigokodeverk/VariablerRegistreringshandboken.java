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
public class VariablerRegistreringshandboken {
	private String beskrivelse;
	private String gyldigFoM;
	private String gyldigToM;
	private Identifikator kode;
	private String referanse;
	private String variabel;
	}

