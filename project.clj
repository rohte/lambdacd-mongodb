(defproject lambdacd-mongodb "1.0.4"
            :description "LambdaCD extension which lets you use a MongoDB to persist the state of pipelines"
            :url "https://github.com/SimonMonecke/lambdacd-mongodb"
            :license {:name "The MIT License (MIT)"
                      :url "http://opensource.org/licenses/MIT"}
            :scm {:name "git"
                  :url "https://github.com/SimonMonecke/lambdacd-mongodb.git"}
            :dependencies [[lambdacd "0.9.0"]
                           [ring-server "0.4.0"]
                           [org.clojure/clojure "1.8.0"]
                           [org.clojure/tools.logging "0.3.1"]
                           [org.slf4j/slf4j-api "1.7.21"]
                           [ch.qos.logback/logback-core "1.1.7"]
                           [ch.qos.logback/logback-classic "1.1.7"]
                           [com.novemberain/monger "3.0.2"]
                           [com.rpl/specter "0.10.0"]]
            :test-paths ["test", "example"]
            :profiles {:uberjar {:aot :all}}
            :main example-pipeline.pipeline)
