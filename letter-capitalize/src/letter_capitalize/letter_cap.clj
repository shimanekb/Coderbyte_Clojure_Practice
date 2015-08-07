(ns letter-capitalize.letter-cap
  (:require [clojure.string :as str]))

(defn capitalize-letters [sentence]
  "takes a string/sentence and capitalizes the first letters of every word"
  (str/join " " (map str/capitalize (str/split sentence #"\s"))))
