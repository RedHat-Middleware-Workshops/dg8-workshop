package org.acme;

import org.infinispan.Cache;
import org.infinispan.commons.api.CacheContainerAdmin;
import org.infinispan.configuration.cache.Configuration;
import org.infinispan.configuration.cache.ConfigurationBuilder;
import org.infinispan.manager.DefaultCacheManager;
import org.infinispan.transaction.TransactionMode;

import javax.transaction.TransactionManager;


public class Exercise5 {


    public static void main(String[] args) throws Exception {

        /* UNCOMMENT When starting this exercise

        // Construct a local cache manager
        DefaultCacheManager cacheManager = new DefaultCacheManager();
        // Create a transaction cache config
        ConfigurationBuilder builder = new ConfigurationBuilder();
        builder.transaction().transactionMode(TransactionMode.TRANSACTIONAL);
        Configuration cacheConfig = builder.build();
        // Create a cache with the config
        Cache<String, String> cache = cacheManager.administration()
                .withFlags(CacheContainerAdmin.AdminFlag.VOLATILE)
                .getOrCreateCache("cache", cacheConfig);
        
        //TODO Obtain the transaction manager

        
        // TODO Perform some operations within a transaction and commit it

        


        // Display the current cache contents
        System.out.printf("key1 = %s\nkey2 = %s\n", cache.get("key1"), cache.get("key2"));
        
        //TODO Perform some operations within a transaction and roll it back

        
        // Display the current cache contents
        System.out.printf("key1 = %s\nkey2 = %s\n", cache.get("key1"), cache.get("key2"));
        
        // Stop the cache manager and release all resources
        cacheManager.stop();

        System.exit(0);

        UNCOMMENT When starting this exercise */
    }

}
