(ns todo-application.core-test
  (:require [clojure.test :refer :all]
            [todo-application.core :refer :all]))


(deftest binomial-test
  (testing "sample binomial function."
    (is (= (binomial 5 3) 10))))
