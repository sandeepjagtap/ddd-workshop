# ddd-workshop

#outline
     
 * System with Anemic domain model - With Picture of various layers (controller-service-repository-domain) 
    * Unit tests are costly
    * Behaviour not in right place.
    * Difficult to reuse. Logic in repository, controllers, services.     
    
 * System with with modules and shared domain classes  - With Picture of various layers (controller-service-repository-domain)
    * Product class with mixed behaviours. Product class expiry related behaviour, Available Quantity, Weight related behaviour
     
 * System with modules and each module having its own domain classes  - With Picture of various layers (controller-service-repository-domain)
    * Scaling
         * Modules like ShoppingCart, Inventory, Shipping. Different Product class per each module
    * Availability
         * All modules are deployed together. If non-important module fails due to load, it will bring down entire System.
    * Read vs Write
         * System could be write heavy or read heavy. There is no way to tune it accordingly as it is deployed as single process.
 
 *  System with separate deployments for each module  - With Picture of various layers (controller-service-repository-domain)
     * Read vs Write
              * Module could be write heavy or read heavy. There is no way to tune it accordingly as it is deployed as single process.
              
 *  Audit requirements for each activity in the system.
 
 *  Ability to prove the why data is what it is NOW.
 
 *  Ability to provide data to new systems from start (from existing systems)
 

# Enter DDD
  * Mini e-commerce website
    Customer should be able to view products.
    Customer should be able to add/edit products to cart and buy.
    Check order status
    Check order history  
    Inventory of available products should be maintained.
      
  ## Building blocks
    * Model
    * Entity
    * Value Object
    * Aggregate and Aggregate Root
        * Strong/Transactional Consistency
    * Domain Service
    * Factory
    * Repository
  ## Strategic   
     * Ubiquitous language     
     * Bounded contexts
     * Context Maps
        ** aniticorruption
        ** customer/supplier
        ** published language
        ** Open host service
        ** shared kernel
         
             
              