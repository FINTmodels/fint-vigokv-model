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
public class Lareplaner {
	public enum Relasjonsnavn {
			MERKELAPP,
			ERSTATTER,
			LAREPLAN,
			KOMPETANSEMALSETT,
			PROGRAMOMRADE
	}

	private String dokumentreferanse;
	private String formal;
	private String forsteEksamen;
	private String grunnleggendeFerdighetBeskrivelse;
	private String grunnleggendeFerdighetDigitaleVerktoy;
	private String grunnleggendeFerdighetFritekst;
	private String grunnleggendeFerdighetLese;
	private String grunnleggendeFerdighetMuntlig;
	private String grunnleggendeFerdighetRegne;
	private String grunnleggendeFerdighetSkriftlig;
	private String gyldigFra;
	private String gyldigTil;
	private String hovedomraderIFaget;
	private String hovedomraderInnledning;
	private String hovedomraderOverskrift;
	private Identifikator kode;
	private String kompetansemalInnledning;
	private String navn;
	private Identifikator PSI;
	private String sisteEksamen;
	private String sprak;
	private String struktur;
	private String timetall;
	private String utgatt;
	private String vurderingIFaget;
	}

