(ns coderbyte-clojure-challenges.core-test
  (:require [clojure.test :refer :all]
            [coderbyte-clojure-challenges.core :refer :all]))

(deftest can-print
  (testing "The hello function"
    (is (= "Hello, World!" (hello)))))
