(defproject jepsen "0.0.3-SNAPSHOT"
            :description "Call Me Maybe: Network Partitions in Practice"
            :dependencies [[org.clojure/clojure "1.6.0-beta1"]
                           [org.clojure/data.fressian "0.2.0"]
;                            :exclusions [org.fressian/fressian]]
                           [org.clojure/tools.logging "0.2.6"]
                           [clj-time "0.6.0"]
                           [knossos "0.1.1-SNAPSHOT"]
                           [clj-ssh "0.5.7"]
                           [hiccup "1.0.5"]
                           [org.clojars.achim/multiset "0.1.0-SNAPSHOT"]
;                           [com.novemberain/welle "2.0.0-beta1"]
;                           [com.taoensso/carmine "1.6.0"]
;                           [com.novemberain/monger "1.5.0"]
;                           [org.clojure/java.jdbc "0.3.0-alpha1"]
;                           [korma "0.3.0-RC5"]
;                           [postgresql/postgresql "8.4-702.jdbc4"]
                           [org.clojure/tools.cli "0.2.2"]
;                           [com.nuodb.jdbc/nuodb-jdbc "1.1.1"]
                           [myguidingstar/clansi "1.3.0"]
;                           [org.apache.curator/curator-recipes "2.0.1-incubating"
;                            :exclusions [org.jboss.netty/netty]]
;                           [clj-kafka "0.1.2-0.8"]
;                           [clojurewerkz/cassaforte "1.2.0"
;                            :exclusions [com.datastax.cassandra/cassandra-driver-core]]
;                           [com.datastax.cassandra/cassandra-driver-core "1.0.3"]
                           [byte-streams "0.1.4"]
                           [com.novemberain/langohr "2.7.1"
                            :exclusions [com.google.guava/guava]]
                           [com.foundationdb/fdb-java "2.0.0"]
                           [com.basho.riak/riak-client "1.4.4"
                            :exclusions [com.fasterxml.jackson.core/jackson-core
                                         org.apache.httpcomponents/httpclient]]
                           [com.netflix.curator/curator-framework "1.3.3"
                            :exclusions [org.slf4j/slf4j-api
                                         org.slf4j-log4j12
                                         com.google.guava/guava]]
;                           [com.datomic/datomic-pro "0.9.4707"
;                            :exclusions [org.apache.httpcomponents/httpclient
;                                         ; Why on earth is this a dep here? It
;                                         ; causes circular dependencies with
;                                         ; slf4j-log4j, which is ALSO a datomic
;                                         ; dep via ZK...
;                                         org.slf4j/log4j-over-slf4j
;                                         ; Cool thanks for breaking my logging
;                                         org.slf4j/slf4j-nop]]
                          [clojurewerkz/elastisch "2.0.0-beta5-SNAPSHOT"]
                          [verschlimmbesserung "0.1.1-SNAPSHOT"]]
            :profiles {:dev {:dependencies []}}
            :main jepsen.bin
            :jvm-opts ["-Xmx32g" "-XX:+UseConcMarkSweepGC" "-XX:+UseParNewGC"
                       "-XX:+CMSParallelRemarkEnabled" "-XX:+AggressiveOpts"
                       "-XX:+UseFastAccessorMethods" "-server"])
