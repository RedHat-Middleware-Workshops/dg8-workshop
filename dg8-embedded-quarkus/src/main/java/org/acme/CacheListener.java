package org.acme;

import org.infinispan.notifications.Listener;
import org.infinispan.notifications.cachelistener.annotation.CacheEntryCreated;
import org.infinispan.notifications.cachelistener.annotation.CacheEntryModified;
import org.infinispan.notifications.cachelistener.event.CacheEntryCreatedEvent;
import org.infinispan.notifications.cachelistener.event.CacheEntryModifiedEvent;

@Listener(clustered = true)
public class CacheListener {

    @CacheEntryCreated
    public void entryCreated(CacheEntryCreatedEvent<String, Score> event) {
        System.out.printf("-- Entry for %s created \n", event.getType());
        if (!event.isOriginLocal()) {
            System.out.printf("-- Entry for %s created by another node in the cluster\n", event.getKey());
        }
    }

    @CacheEntryModified
    public void entryUpdated(CacheEntryModifiedEvent<String, Score> event){
        if (!event.isOriginLocal()) {
            System.out.printf("-- Entry for %s modified by another node in the cluster\n", event.getKey());
        }
        System.out.printf("-- Entry for %s modified\n", event.getType());
    }
}