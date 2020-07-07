package org.acme;

import org.infinispan.AdvancedCache;
import org.infinispan.functional.EntryView;
import org.infinispan.functional.FunctionalMap;
import org.infinispan.functional.MetaParam.MetaLifespan;
import org.infinispan.functional.Traversable;
import org.infinispan.configuration.cache.ConfigurationBuilder;
import org.infinispan.functional.impl.FunctionalMapImpl;
import org.infinispan.functional.impl.ReadOnlyMapImpl;
import org.infinispan.functional.impl.ReadWriteMapImpl;
import org.infinispan.functional.impl.WriteOnlyMapImpl;
import org.infinispan.manager.DefaultCacheManager;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

// Inifinispan Functional
public class Exercise3 {

    public static void main(String[] args) throws Exception {
      /* UNCOMMENT When starting this exercise

      
      DefaultCacheManager cacheManager = new DefaultCacheManager();
        cacheManager.defineConfiguration("local", new ConfigurationBuilder().build());
        AdvancedCache<String, String> cache = cacheManager.<String, String>getCache("local").getAdvancedCache();
        FunctionalMapImpl<String, String> functionalMap = FunctionalMapImpl.create(cache);
        FunctionalMap.WriteOnlyMap<String, String> writeOnlyMap = WriteOnlyMapImpl.create(functionalMap);
        FunctionalMap.ReadOnlyMap<String, String> readOnlyMap = ReadOnlyMapImpl.create(functionalMap);


        // Create a read-write map
        FunctionalMap.ReadWriteMap<String, String> readWriteMap = ReadWriteMapImpl.create(functionalMap);


        // Use read-only multi-key operation to read current values for multiple keys
        Traversable<EntryView.ReadEntryView<String, String>> entryViews =
                readOnlyMap.evalMany(data.keySet(), readOnlyView -> readOnlyView);
        System.out.printf("Updated entries: %n");
        entryViews.forEach(view -> System.out.printf("%s%n", view));

        // Finally, print out the previous entry values
        System.out.printf("Previous entry values: %n");
        previousValues.forEach(prev -> System.out.printf("%s%n", prev));

        cacheManager.stop();
        
        System.exit(0);

        UNCOMMENT When starting this exercise */
    }

}
