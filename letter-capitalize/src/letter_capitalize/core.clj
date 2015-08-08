(ns letter-capitalize.core
  (:use [letter-capitalize.letter-cap :only (capitalize-letters)])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (loop [value (do
                 (println "Enter a sentence:")
                 (read-line))]
    (println (capitalize-letters value))))
