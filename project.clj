(defproject my-personal-kanban-local-cloud "0.1.1"
  :description "My Personal Kanban Local Cloud"
  :url "http://my-personal-kanban.appspot.com"
  :license {:name "GNU General Public Licence version 3"
            :url "ttp://www.gnu.org/licenses/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring/ring-core "1.8.0"]
                 [ring/ring-jetty-adapter "1.8.0"]
                 [org.clojure/data.json "0.2.7"]
                 [clj-time "0.15.2"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler mpk.core/mpk-app}
  :profiles{
    :uberjar{
      :aot :all
      :main mpk.core}})
