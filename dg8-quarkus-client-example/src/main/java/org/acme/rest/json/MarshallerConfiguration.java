package org.acme.rest.json;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import org.infinispan.protostream.MessageMarshaller;

@ApplicationScoped
public class MarshallerConfiguration {

    @Produces
    MessageMarshaller gameMarshaller() {
        return new GameMarshaller();
    }
}

