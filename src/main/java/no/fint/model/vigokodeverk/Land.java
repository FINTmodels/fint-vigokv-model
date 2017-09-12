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
public class Land {
	private String gyldigFoM;
	private String gyldigToM;
	private Identifikator kode;
	private String navn;
	private String navnEngelsk;
	private String navnNynorsk;
	private String nyKode;
	private String statsborgerskap;
	}

