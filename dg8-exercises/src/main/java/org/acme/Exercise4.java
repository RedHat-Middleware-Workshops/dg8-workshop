package org.acme;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.infinispan.Cache;
import org.infinispan.configuration.cache.ConfigurationBuilder;
import org.infinispan.manager.DefaultCacheManager;

// Streams
public class Exercise4 {

    public static void main(String[] args) {
       /* UNCOMMENT When starting this exercise


        // Construct a simple local cache manager with default configuration
        DefaultCacheManager cacheManager = new DefaultCacheManager();
        // Define local cache configuration
        cacheManager.defineConfiguration("local", new ConfigurationBuilder().build());
        // Obtain the local cache
        Cache<String, String> cache = cacheManager.getCache("local");
        
        // TODO: Store some values


        // TODO: Map and reduce the keys


        System.out.printf("Result = %d\n", result);
        // Stop the cache manager and release all resources
        cacheManager.stop();

        System.exit(0);

        UNCOMMENT When starting this exercise */
    }

}