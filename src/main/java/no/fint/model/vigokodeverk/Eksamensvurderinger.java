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
public class Eksamensvurderinger implements FintMainObject {
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
