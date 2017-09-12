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
public class Fagmerknader {
	private String fagskolen;
	private String grunnskole;
	private String gyldigFoM;
	private String gyldigToM;
	private Identifikator kode;
	private String navn;
	private String navnBokmal;
	private String navnEngelsk;
	private String navnKortform;
	private String navnKortformEngelsk;
	private String navnKortformNynorsk;
	private String navnKortformSamisk;
	private String navnNynorsk;
	private String navnSamisk;
	private Identifikator PSI;
	private String sistEndret;
	private String standardkommentarVitnemalType;
	private String utgatt;
	private String videregaende;
	}

