(ns second-greatlow.core
  (:use [second-greatlow.greatlow :only (find-second-greatlow)])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (loop [value (do
                 (println "Enter an array of numerals:")
                 (find-second-greatlow (read-string (read-line))))]
    (println "Result: " value)))
