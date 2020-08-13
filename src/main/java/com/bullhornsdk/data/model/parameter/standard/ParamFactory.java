package com.bullhornsdk.data.model.parameter.standard;

import com.bullhornsdk.data.model.parameter.AssociationParams;
import com.bullhornsdk.data.model.parameter.CorpNotesParams;
import com.bullhornsdk.data.model.parameter.EntityParams;
import com.bullhornsdk.data.model.parameter.FastFindParams;
import com.bullhornsdk.data.model.parameter.FileParams;
import com.bullhornsdk.data.model.parameter.MetaParams;
import com.bullhornsdk.data.model.parameter.OptionsParams;
import com.bullhornsdk.data.model.parameter.QueryParams;
import com.bullhornsdk.data.model.parameter.ResumeFileParseParams;
import com.bullhornsdk.data.model.parameter.ResumeTextParseParams;
import com.bullhornsdk.data.model.parameter.SearchParams;

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

    public static OptionsParams optionsParams() {
        return StandardOptionsParams.getInstance();
    }

}
