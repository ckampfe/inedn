(ns inedn.core
  (:require [clojure.pprint :refer [pprint]])
  (:gen-class))

(defn -main [& path]
  (-> (read *in*)
      (get-in (mapv read-string path))
      pprint))
