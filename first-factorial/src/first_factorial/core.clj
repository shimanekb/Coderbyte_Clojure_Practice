(ns first-factorial.core
  (:use first-factorial.fn-factorial.factorial)
  (:require [first-factorial.fn-factorial.factorial :refer :all])
  (:gen-class))

(defn -main
  "ask for factorial"
  [& args]
  (loop [value (do
         (println "Enter an Integer:")
         (read-string (read-line)))]
    (println (format "Result: %d" (factorial value)))))
