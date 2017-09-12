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
public class Eksamensformer {
	private String gyldigFoM;
	private String gyldigToM;
	private Identifikator kode;
	private String navn;
	private String navnEngelsk;
	private String navnFransk;
	private String navnNynorsk;
	private String navnSamisk;
	private String navnSpansk;
	private String navnTysk;
	}

