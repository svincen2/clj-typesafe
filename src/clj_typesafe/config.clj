(ns clj-typesafe.config
  (:import [com.typesafe.config Config]))

(defn get-config
  "Wrapper around Config.getConfig"
  [^Config config k]
  (.getConfig config k))

(defn get-string
  "Wrapper around Config.getString"
  [^Config config k]
  (.getString config k))

(defn get-int
  "Wrapper around Config.getInt"
  [^Config config k]
  (.getInt config k))

(defn get-double
  "Wrapper around Config.getDouble"
  [^Config config k]
  (.getDouble config k))

(defn get-number
  "Wrapper around Config.getNumber"
  [^Config config k]
  (.getNumber config k))

(defn get-boolean
  "Wrapper around Config.getBoolean"
  [^Config config k]
  (.getBoolean config k))

