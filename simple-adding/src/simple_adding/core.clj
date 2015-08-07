(ns simple-adding.core
  (:use [simple-adding.simple-add :only (simple-add)])
  (:gen-class))

(defn -main
  "ask for input"
  [& args]
  (loop [value (do
                 (println "Please enter a positive integer:")
                 (read-string (read-line)))]
    (println (format "Result %d" (simple-add value)))))
