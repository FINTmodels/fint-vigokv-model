// Built from tag v2.4.0-rc-3

package no.fint.model.vigokodeverk;

import java.util.Arrays;
import java.util.List;

public enum VigokodeverkActions {
	
	GET_EKSAMENSFORMER,
	GET_ALL_EKSAMENSFORMER,
	UPDATE_EKSAMENSFORMER,
	GET_EKSAMENSVURDERINGER,
	GET_ALL_EKSAMENSVURDERINGER,
	UPDATE_EKSAMENSVURDERINGER,
	GET_FAG,
	GET_ALL_FAG,
	UPDATE_FAG,
	GET_FAGMERKNADER,
	GET_ALL_FAGMERKNADER,
	UPDATE_FAGMERKNADER,
	GET_FAGTYPER,
	GET_ALL_FAGTYPER,
	UPDATE_FAGTYPER,
	GET_FREMMEDSPRAK,
	GET_ALL_FREMMEDSPRAK,
	UPDATE_FREMMEDSPRAK,
	GET_FYLKER,
	GET_ALL_FYLKER,
	UPDATE_FYLKER,
	GET_HOVEDOMRADER,
	GET_ALL_HOVEDOMRADER,
	UPDATE_HOVEDOMRADER,
	GET_KARAKTERER,
	GET_ALL_KARAKTERER,
	UPDATE_KARAKTERER,
	GET_KOMMUNER,
	GET_ALL_KOMMUNER,
	UPDATE_KOMMUNER,
	GET_KOMPETANSEMAL,
	GET_ALL_KOMPETANSEMAL,
	UPDATE_KOMPETANSEMAL,
	GET_KOMPETANSEMALSETT,
	GET_ALL_KOMPETANSEMALSETT,
	UPDATE_KOMPETANSEMALSETT,
	GET_LAND,
	GET_ALL_LAND,
	UPDATE_LAND,
	GET_LAREPLANER,
	GET_ALL_LAREPLANER,
	UPDATE_LAREPLANER,
	GET_MERKELAPPER,
	GET_ALL_MERKELAPPER,
	UPDATE_MERKELAPPER,
	GET_MORSMAL,
	GET_ALL_MORSMAL,
	UPDATE_MORSMAL,
	GET_MALFORM,
	GET_ALL_MALFORM,
	UPDATE_MALFORM,
	GET_OPPLARINGSFAG,
	GET_ALL_OPPLARINGSFAG,
	UPDATE_OPPLARINGSFAG,
	GET_POSTSTEDER,
	GET_ALL_POSTSTEDER,
	UPDATE_POSTSTEDER,
	GET_PROGRAMOMRADEKATEGORIER,
	GET_ALL_PROGRAMOMRADEKATEGORIER,
	UPDATE_PROGRAMOMRADEKATEGORIER,
	GET_PROGRAMOMRADER,
	GET_ALL_PROGRAMOMRADER,
	UPDATE_PROGRAMOMRADER,
	GET_SKOLER,
	GET_ALL_SKOLER,
	UPDATE_SKOLER,
	GET_UTDANNINGSPROGRAMMER,
	GET_ALL_UTDANNINGSPROGRAMMER,
	UPDATE_UTDANNINGSPROGRAMMER,
	GET_VARIABLERREGISTRERINGSHANDBOKEN,
	GET_ALL_VARIABLERREGISTRERINGSHANDBOKEN,
	UPDATE_VARIABLERREGISTRERINGSHANDBOKEN,
	GET_VITNEMALSMERKNADER,
	GET_ALL_VITNEMALSMERKNADER,
	UPDATE_VITNEMALSMERKNADER,
	GET_ARSAKSKODER,
	GET_ALL_ARSAKSKODER,
	UPDATE_ARSAKSKODER,
	GET_ONSKESTATUS,
	GET_ALL_ONSKESTATUS,
	UPDATE_ONSKESTATUS
	;


    /**
     * Gets a list of all enums as string
     *
     * @return A string list of all enums
     */
    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(VigokodeverkActions.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }

}

