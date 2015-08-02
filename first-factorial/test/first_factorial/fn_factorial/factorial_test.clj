(ns first-factorial.fn-factorial.factorial-test
  (:use first-factorial.fn-factorial.factorial)
  (:require [clojure.test :refer :all]
            [first-factorial.fn-factorial.factorial :refer :all]))

(deftest factorial-functions
  (testing "The factorial function"
    (is (= 24 (factorial 4)))))
