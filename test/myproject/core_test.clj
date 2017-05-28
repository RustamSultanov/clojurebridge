(ns myproject.core-test
   (:require [clojure.test :refer :all]
             [myproject.core :refer :all]))

(def test "Test")

(def x (* 1000 60))
(def y (* 1000 3600))

(quot x y)

(rem x y)
(print-str "minute" x)

