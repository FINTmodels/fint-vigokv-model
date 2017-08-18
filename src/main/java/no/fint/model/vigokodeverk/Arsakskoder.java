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
public class Arsakskoder {
	private String beskrivelse;
	private String gyldigFoM;
	private String gyldigToM;
	private Identifikator kode;
	private String navn;
	private String type;
	}

