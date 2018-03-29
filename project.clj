(defproject ring-version-header "0.1.0"
  :description "A Ring's middleware that adds a version into HTTP X-Version header"
  :url "https://github.com/druids/ring-version-header"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}

  :profiles {:dev {:plugins [[lein-cloverage "1.0.10"]
                             [lein-kibit "0.1.6"]
                             [jonase/eastwood "0.2.5"]]
                   :dependencies [[org.clojure/clojure "1.9.0"]
                                  [ring/ring-core "1.6.3"]]}})
