/*
    See lda-top/LICENCE (or http://elda.googlecode.com/hg/LICENCE)
    for the licence for this software.
    
    (c) Copyright 2011 Epimorphics Limited
    $Id$
*/
package com.epimorphics.lda.specmanager;

import com.epimorphics.lda.specs.APISpec;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.Resource;

import static com.epimorphics.lda.specmanager.SpecUtils.digestKey;

public class SpecEntry {

    final String uri;
    final APISpec spec;
    final byte[] keyDigest;
    final Model model;

    SpecEntry(String uri, String key, APISpec spec, Model model) {
        this.uri = uri;
        this.keyDigest = digestKey(uri, key);
        this.spec = spec;
        this.model = model;
    }

    public APISpec getSpec() {
        return spec;
    }

    public Resource getRoot() {
        return model.createResource(uri);
    }
}