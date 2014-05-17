(ns my-first-clojure.core)

;;1) Nothing but the Truth
true
;;2) Simple Math
4
;;3) Intro to Strings
"HELLO WORLD"
;;4) Intro to Lists
:a :b :c
;;5) Lists: conj
'(1 2 3 4)
'(1 2 3 4)
;;6) Intro to Vectors
:a :b :c
;;7) Vectors: conj
'(1 2 3 4)
;;8) Intro to Sets
#{:a :b :c :d}
;;9) Sets: conj
2
;;10) Intro to Maps
20
;;11) Maps: conj
{:b 2}
;;12) Intro to Sequences
3
;;13) Sequences: rest
[20 30 40]
;;14) Intro to Functions
8
;;15) Double Down
(partial * 2)
;;16) Hello World
#(str "Hello, " % "!")
;;17) Sequences: map
(list 6 7 8)
;;18) Sequences: filter
(list 6 7)
;;19) Last Element
#(first (reverse %))
;;20) Penultimate Element
(comp second reverse)
;;21) Nth Element
(fn[col n] (if (zero? n) (first col) (recur (rest col) (- n 1))))
;;22) Count a Sequence
#(reduce (fn [x y] (inc x)) 0 %)
;;23) Reverse a Sequence
#(into '() %)
;;24) Sum It All Up
#(reduce + %)
;;25) Find the odd numbers
#(filter odd? %)
;;26) Fibonacci Sequence
#(take % (map first (iterate (fn [[a b]] [b (+ b a)]) [1 1])))
;;27) Palindrome Detector
#(= (seq %) (reduce conj () %))
;;35) Local bindings
7
;;36) Let it Be
[x 7 y 3 z 1]
;;37) Regular Expressions
"ABC"
;;64) Intro to Reduce
+
