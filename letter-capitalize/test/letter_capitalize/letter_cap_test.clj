(ns letter-capitalize.letter-cap-test
  (:use [letter-capitalize.letter-cap :only (capitalize-letters)])
  (:require [clojure.test :refer :all]))

(deftest letter-cap-suite
  (testing "The capitalize-letters function "
    (is (= "This Is The Test" (capitalize-letters "this is the test")))))
