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
public class Eksamensvurderinger {
	private String gammelFagkode;
	private String gyldigFoM;
	private String gyldigToM;
	private String hoyesteNiva;
	private String navn;
	private Identifikator PSI;
	private String standpunkt;
	private String typeEksamensfag;
	private String typeEksamensformVitnemal;
	private String typeEksamensordning;
	private String typeVurderingsform;
	}

