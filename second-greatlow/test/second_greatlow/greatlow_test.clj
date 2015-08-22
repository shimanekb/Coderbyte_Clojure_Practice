(ns second-greatlow.greatlow-test
  (:require [clojure.test :refer :all])
  (:use [second-greatlow.greatlow :only (find-second-greatlow)]))

(deftest second-greatlow-testsuite
  (testing "The find-second-greatlow function"
    (is (= [42 42] (find-second-greatlow [1 42 42 180])))
    (is (= [90 4] (find-second-greatlow [4 90])))))
