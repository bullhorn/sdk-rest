package com.bullhornsdk.data.model.parameter.standard;

import com.bullhornsdk.data.model.parameter.*;

/**
 * Factory that handles instantiations of RequestParameters for the different api calls.
 * 
 * @author Magnus Fiore Palm
 * 
 */
public class ParamFactory {

    public static EntityParams entityParams() {
        return StandardEntityParams.getInstance();
    }

    public static QueryParams queryParams() {
        return StandardQueryParams.getInstance();
    }

    public static SearchParams searchParams() {
        return StandardSearchParams.getInstance();
    }

    public static FastFindParams fastFindParams() {
        return StandardFastFindParams.getInstance();
    }

    public static MetaParams metaParams() {
        return StandardMetaParams.getInstance();
    }

    public static ResumeFileParseParams resumeFileParseParams() {
        return StandardResumeFileParseParams.getInstance();
    }

    public static ResumeTextParseParams resumeTextParseParams() {
        return StandardResumeTextParseParams.getInstance();
    }

    public static FileParams fileParams() {
        return StandardFileParams.getInstance();
    }

    public static AssociationParams associationParams() {
        return StandardAssociationParams.getInstance();
    }
    
    public static CorpNotesParams corpNotesParams() {
    	return StandardCorpNotesParams.getInstance();
    }

    public static OptionParams optionsParams() {
        return StandardOptionParams.getInstance();
    }
}
