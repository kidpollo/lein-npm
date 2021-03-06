(defproject kidpollo/lein-npm "0.7.4-SNAPSHOT"
  :description "Manage npm dependencies for CLJS projects"
  :url "https://github.com/kidpollo/lein-npm"
  :license {:name "Apache License, version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :dependencies [[cheshire "5.2.0"]]
  :profiles {:test {:dependencies [[fixturex "0.3.0"]]}}
  :eval-in-leiningen true)
