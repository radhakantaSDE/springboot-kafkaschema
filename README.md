#### Kafka,  Schema Registry, zookeeper concepts

- #### Kafka

        - Kafka is message queue to hold the message for certain period of time and process in FIFO order with multiple 


- #### Zookeeper
        - zookeeper helps to keep meta-info regarding kafka's operation
        - 


- #### Schema Registry
        - Schema Registry keeps message processing schemas to serialize and de-serialise data (i.e Message contract) https://docs.confluent.io/platform/current/schema-registry/index.html
        - Schemas can be evolve first before changing message contract - If producer will try to send differen structured (except registered schema) message then, operation will fail
        - Schema evolve compatability type : BACKWARD, BACKWARD_TRANSITIVE, FORWARD, FORWARD_TRANSITIVE, FULL, FULL_TRANSITIVE, NONE. In details (https://docs.confluent.io/platform/current/schema-registry/fundamentals/schema-evolution.html)


#### How to start kafka, zookeeper and schemaRegistry ?

###### We need to run docker-composer.yaml file after docker desktop up.
        $> docker compose up
