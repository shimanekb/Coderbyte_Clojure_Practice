(ns reverse-string.reverse-test
  (:require [clojure.test :refer :all]
            [reverse-string.reverse :refer :all]))

(deftest reverse-functions
  (testing "The reverse-string function")
    (is (= "dlrow" (reverse-string "world"))))
