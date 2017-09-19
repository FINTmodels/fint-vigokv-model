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
public class Fag {
	public enum Relasjonsnavn {
			EKSAMENSVURDERINGELEV,
			EKSAMENSVURDERINGPRIVATIST,
			ERSTATTER,
			MERKELAPP,
			FAGTYPE,
			STANDARDKOMMENTAR,
			GREP,
			OPPLARINGSFAG,
			PABYGNING,
			TILHORERPROGRAMOMRADE
	}

	private String elevtgrl;
	private String fagskolen;
	private String forsteEksamen;
	private String forstUndervist;
	private String gammelFagkode;
	private String gyldigFoM;
	private String gyldigToM;
	private String hjelpemidler;
	private String hjelpemidlerSentralEksamen;
	private String importer;
	private Identifikator kode;
	private String merknad;
	private String navn;
	private String navnBokmal;
	private String navnEngelsk;
	private String navnFransk;
	private String navnKortform;
	private String navnKortformEngelsk;
	private String navnKortformNynorsk;
	private String navnKortformSamisk;
	private String navnLangt;
	private String navnNynorsk;
	private String navnSamisk;
	private String navnSpansk;
	private String navnTysk;
	private String nettoOmfang;
	private String omfangVitnemal;
	private String oppgavetype;
	private Identifikator PSI;
	private String sensurtype;
	private String sisteEksamen;
	private String sistUndervist;
	private String standardKommentar;
	private String totaltOmfang;
	private String tverrfag;
	private String utenStandpunkt;
	private String utgatt;
	private String arstimerStatistikk;
	}

