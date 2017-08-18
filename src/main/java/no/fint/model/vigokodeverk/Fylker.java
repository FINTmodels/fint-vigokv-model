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
public class Fylker {
	private Identifikator fylkesnummer;
	private String gyldigFoM;
	private String gyldigToM;
	private String kortnavn;
	private String langnavn;
	private String navn;
	private String skolear;
	private String termin;
	}

