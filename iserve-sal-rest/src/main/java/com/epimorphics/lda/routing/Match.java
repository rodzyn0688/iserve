/*
    See lda-top/LICENCE (or http://elda.googlecode.com/hg/LICENCE)
    for the licence for this software.
    
    (c) Copyright 2011 Epimorphics Limited
    $Id$
*/

/******************************************************************
 File:        Match.java
 Created by:  Dave Reynolds
 Created on:  8 Feb 2010
 *
 * (c) Copyright 2010, Epimorphics Limited
 * $Id:  $
 *****************************************************************/

package com.epimorphics.lda.routing;

import com.epimorphics.lda.core.APIEndpoint;

import java.util.Map;

/**
 * Represents the result of a router matching an incoming URL
 * against its table of known endpoints.
 *
 * @author <a href="mailto:dave@epimorphics.com">Dave Reynolds</a>
 * @version $Revision: $
 */
public class Match {
    final APIEndpoint endpoint;
    final Map<String, String> bindings;
    final String context;

    public Match(String context, APIEndpoint endpoint, Map<String, String> bindings) {
        this.endpoint = endpoint
        ;
        this.bindings = bindings
        ;
        this.context = context
        ;
    }

    public String getContext() {
        return context;
    }

    public APIEndpoint getEndpoint() {
        return endpoint;
    }

    public Map<String, String> getBindings() {
        return bindings;
    }
}

