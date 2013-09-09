/*
 * Copyright (c) 2013. Knowledge Media Institute - The Open University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.ac.open.kmi.iserve.sal.events;

import java.net.URI;
import java.util.Date;

/**
 * KnowledgeBaseItemEvent captures events related to one single ontology
 *
 * @author <a href="mailto:carlos.pedrinaci@open.ac.uk">Carlos Pedrinaci</a> (KMi - The Open University)
 * @since 05/09/2013
 */
public abstract class OntologyEvent extends KnowledgeBaseManagerEvent {

    URI ontologyUri;

    public OntologyEvent(Date date, URI ontologyUri) {
        super(date);
        this.ontologyUri = ontologyUri;
    }

    public URI getOntologyUri() {
        return ontologyUri;
    }
}
