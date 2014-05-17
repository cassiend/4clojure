(ns my-first-clojure.core)

(defn foo
  [x]
  (str x " Hello, World!"))
(foo "Cassie")

(defn factorial
  ([x] (factorial x 1))
  ([x acc]
   (if(= x 0)
     acc
     (recur (dec x) (* acc x)))))

(defn factorial [n]
  (if (= n 1)
    1
    (* n (factorial (dec n)))))


(factorial 2)
(+ 1 2)

(map factorial (range 1 10))

(defn poop [n]
  (take n '(1 2 3 4)))

(defn poopmap [n] (map inc [1 2 3 4 5]))

(defn pooper [n] take n '(4 5 6 7) n)

(pooper 3)


(defn pal [n] (iterate ()))


(defn poopy [n] (last (take n (iterate (fn [[a b]] [b (+ b a)]) [1 1]))))


(poop 2)
(poopmap 3)
(poopy 10)

(defn getSequence [coll n] ((take n (repeat n rest))))

(defn blah [col n] (if (zero? n) (first col) (recur (rest col) (- n 1))))

(defn counter [col n] (if (zero? n) (first col) (recur (rest col) (+ n 1))))


(counter '(1 2 3 3 1))


(defn counter [n] (reduce (fn [x y] (inc x)) 0 n))

(counter '(1 2 3 4 5))


(counter '(1 2 3 4))


(defn fib [n] (take n (map first (iterate (fn [[a b]] [b (+ b a)]) [1 1]))))

(defn fib [n] (conj [1 1] ((fn [a b] b (+ b a)))))


(+ (fib (dec 10)))

(def [n] (memoize #((if (< % 3) 1 (+ (fib (- % 1)) (fib (- % 2)))))))


(fib 4)

#(take % (map first (iterate (fn [[a b]] [b (+ b a)]) [1 1])))

(def fib-memo (memoize myfunc))



(def indexes [1 2 3])
(let [[x y] point] (println "x:" x "y:" y))


(fn fib (if (< n 2) n (+ (fib (- n 1)) (fib (- n 2)))))

(fib 60)

(defn pal [n] (= (seq n) (reduce conj () n)))

(defn pal [n] (reduce conj () n))

(defn pal [n] (= (apply str n) (apply str (reverse n))))

(pal '(4 3 2 1 1 2 3 4))
(pal "racecar")


(defn fib [n] (loop [i 1 f 1 s 1] (if (= i n) f (recur (inc i) s (+ f s)))))

(fib 10)

(nth '(4 5 6 7) 2)

(first (reverse [1 2 3 4]))


(defn rev [n] #(take-while nth %))

(defn rev [n] (into '() n))

(#(into '() %) [4 2 1 2 3 4 5])

(rev [1 2 3 4 5])

(drop-while even? [-2 -1 0 1 2 3])

(#(filter odd? %) [4 2 1 6])

(reduce + '(1 2 3 4))



(= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
(defn flat [coll n] (conj n))

(flat '((1 2) 3 [4 [5 6]]))

(defn p [[h & r]]
  (or
   (empty? r)
   (and
    (= h (last r))
    (p (drop-last r)))))

(p "subinoonibus")


(defn h ([n] (h n :a :c :b)) ([n s d b] (concat (if (> n 1) (h (dec n) s b d)) [(format "%s: %s => %s" n s d)] (if (> n 1) (h (dec n) b d s)))))

(h 10)
