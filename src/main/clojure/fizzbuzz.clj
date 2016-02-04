(ns fizzbuzz)

(defn fizz-buzz [fizz buzz end]
  "Returns Fizz and/or Buzz for all multiples of the fizz and buzz parameters from 1 to end."
  (map (fn [n]
         (cond
           (and (zero? (mod n fizz)) (zero? (mod n buzz))) "FizzBuzz"
           (zero? (mod n fizz)) "Fizz"
           (zero? (mod n buzz)) "Buzz"
           :else n))
       (range 1 (+ end 1))))