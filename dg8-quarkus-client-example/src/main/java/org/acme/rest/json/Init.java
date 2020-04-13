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

    public static final String GAME_CACHE = "games";

    @Inject
    RemoteCacheManager cacheManager;

    private static final String CACHE_CONFIG =
            "<infinispan><cache-container>" +
                    "<distributed-cache name=\"%s\"></distributed-cache>" +
                    "</cache-container></infinispan>";


    /**
     * Listens startup event to load the data
     */
    void onStart(@Observes @Priority(value = 1) StartupEvent ev) {
        String xml = String.format(CACHE_CONFIG, "games");
        cacheManager.administration().getOrCreateCache(GAME_CACHE, new XMLStringConfiguration(xml));
    }
}
