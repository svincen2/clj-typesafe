(ns clj-typesafe.config-factory
  (:refer-clojure :exclude [load]) ; Don't want a warning about overriding clojure.core.load
  (:import [com.typesafe.config ConfigFactory]))

(defn load
  "Wrapper for ConfigFactory.load"
  ([]
   (ConfigFactory/load))
  ([file]
   (ConfigFactory/load file)))

