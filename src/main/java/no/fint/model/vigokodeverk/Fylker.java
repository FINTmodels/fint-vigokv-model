// Built from tag feature-vigokv

package no.fint.model.vigokodeverk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
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

