package org.acme.rest.json;

import javax.annotation.Priority;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.commons.configuration.XMLStringConfiguration;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class Init {

    // Define member variables

    // Add onStart method
}
