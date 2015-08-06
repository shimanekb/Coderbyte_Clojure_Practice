(ns simple-adding.simple-add-test
  (:use [simple-adding.simple-add :only [simple-add]])
  (:require [clojure.test :refer :all]))

(deftest simple-add-test-suite
  (testing "The simple-add function"
    (is (= 6 (simple-add 3)))))
