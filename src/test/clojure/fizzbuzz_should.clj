(ns fizzbuzz-should
  (:require [clojure.test :refer :all]
            [fizzbuzz :refer :all]))


(deftest correctly-say-fizz-buzz
  (is
    (=
      [1 2 "Fizz" 4 "Buzz" "Fizz" 7 8 "Fizz" "Buzz" 11 "Fizz" 13 14 "FizzBuzz"]
      (fizz-buzz 3 5 15))))

(run-tests 'fizzbuzz-should)