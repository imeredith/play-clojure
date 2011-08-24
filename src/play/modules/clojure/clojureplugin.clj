(ns play.modules.clojure.clojureplugin
  (:gen-class
    :name play.modules.clojure.clojureplugin.ClojurePlugin
    :prefix "test-"
    :extends play.PlayPlugin)
  )

(defn test-detectChange
  [this]
  (println "detecting changes"))

(defn test-onApplicationReady
  [this]
  (play.modules.clojure.util/blah))

(defn test-onApplicationStart
  [this]
  (println "onStart"))
