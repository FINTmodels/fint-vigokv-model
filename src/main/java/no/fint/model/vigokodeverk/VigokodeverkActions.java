package no.fint.model.vigokodeverk;

import java.util.Arrays;
import java.util.List;

public enum VigokodeverkActions {

    GET_EKSAMENSVURDERINGER,
    GET_ALL_EKSAMENSVURDERINGER,
    UPDATE_EKSAMENSVURDERINGER,
    GET_FAG,
    GET_ALL_FAG,
    UPDATE_FAG,
    GET_FAGMERKNADER,
    GET_ALL_FAGMERKNADER,
    UPDATE_FAGMERKNADER,
    GET_HOVEDOMRADER,
    GET_ALL_HOVEDOMRADER,
    UPDATE_HOVEDOMRADER,
    GET_KOMPETANSEMAL,
    GET_ALL_KOMPETANSEMAL,
    UPDATE_KOMPETANSEMAL,
    GET_KOMPETANSEMALSETT,
    GET_ALL_KOMPETANSEMALSETT,
    UPDATE_KOMPETANSEMALSETT,
    GET_LAREPLANER,
    GET_ALL_LAREPLANER,
    UPDATE_LAREPLANER,
    GET_MERKELAPPER,
    GET_ALL_MERKELAPPER,
    UPDATE_MERKELAPPER,
    GET_OPPLARINGSFAG,
    GET_ALL_OPPLARINGSFAG,
    UPDATE_OPPLARINGSFAG,
    GET_PROGRAMOMRADER,
    GET_ALL_PROGRAMOMRADER,
    UPDATE_PROGRAMOMRADER,
    GET_UTDANNINGSPROGRAMMER,
    GET_ALL_UTDANNINGSPROGRAMMER,
    UPDATE_UTDANNINGSPROGRAMMER,
    GET_VITNEMALSMERKNADER,
    GET_ALL_VITNEMALSMERKNADER,
    UPDATE_VITNEMALSMERKNADER;


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

