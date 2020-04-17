package com.redhat.com.rhdg;

import java.lang.invoke.MethodHandles;

import org.infinispan.notifications.Listener;
import org.infinispan.notifications.cachelistener.annotation.CacheEntryCreated;
import org.infinispan.notifications.cachelistener.annotation.CacheEntryModified;
import org.infinispan.notifications.cachelistener.event.CacheEntryCreatedEvent;
import org.infinispan.notifications.cachelistener.event.CacheEntryModifiedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Listener(primaryOnly = false)
public class CacheListener {

    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    
    @CacheEntryCreated
    public void entryCreated(CacheEntryCreatedEvent<String, String> event) {
        logger.info(String.format("-- Entry for %s created \n", event.getType()));
        if (!event.isOriginLocal()) {
            logger.info(String.format("-- Entry for %s created by another node in the cluster\n", event.getKey()));
        }
    }

    @CacheEntryModified
    public void entryUpdated(CacheEntryModifiedEvent<String, String> event){
        if (!event.isOriginLocal()) {
            logger.info(String.format("-- Entry for %s modified by another node in the cluster\n", event.getKey()));
        }
        logger.info(String.format("-- Entry for %s modified\n", event.getType()));
    }
}