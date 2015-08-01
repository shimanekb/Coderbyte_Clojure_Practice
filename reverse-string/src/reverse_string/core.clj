(ns reverse-string.core
  (:require [reverse-string.reverse :refer :all])
  (:gen-class))

(defn -main
  "I will take a string and print the reverse."
  [arg]
  (println (str "This is the reverse: " 
                (reverse-string arg))))
