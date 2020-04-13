# dg8-quarkus-client-example

This example showcases the x-site replication with a simple app using infinispan server.  
It was created from the original inifinspan tutorial at 
https://github.com/infinispan/infinispan-simple-tutorials/tree/master/xsite-replication
All credits to the infinispan team for a great tutorial.

How to get it working
----------
1. Make sure you have `docker` and `docker-compose` installed locally.

2. Run `docker-compose up`

    The docker-compose yaml creates the LON and NYC clusters using the `infinispan-xsite.xml` file.
 
3. Access the console of the `LON` cluster site at `http://localhost:11222/console` .

4. Access the console of the `NYC` cluster site at `http://localhost:31222/console`.

5. Run `mvn quarkus:dev` to start the app on port 8080

    The script creates a cache named `xsiteCache` in the LON cluster that defines the NYC site as a backup.
    It is also worth noting that cache topologies can be different when using cross-site replication. In this 
    example, the cache in LON is distributed while the cache in NYC is replicated.

To go further:
Use the console or the [REST API](https://infinispan.org/docs/stable/titles/rest/rest.html#rest_v2_cache_operations)
The app will add data from the UI, for more , play with the console for adding or removing data or use the REST API.

## Deploying on Openshift
To build on openshift `./mvnw clean package -Dquarkus.container-image.build=true`
To deploy `./mvnw clean package -Dquarkus.kubernetes.deploy=true`

Getting the datagrid secret
`oc get secret datagrid-service-generated-secret \                                                                                                                                                                 14:46:32
 -o jsonpath="{.data.identities\.yaml}" | base64 --decode`
