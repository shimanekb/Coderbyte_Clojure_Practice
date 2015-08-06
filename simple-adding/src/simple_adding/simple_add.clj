(ns simple-adding.simple-add
  (:require [clojure.core.reducers :as r]))

(defn simple-add [stoppingNumber]
  "sums numbers from 1 to a given number"
  (r/reduce + 0 (range (inc stoppingNumber))))
