(ns todo-application.core
  (:gen-class))


(defn binomial
  "Calculate the binomial coefficient."
  [n k]
  (let [a (inc n)]
    (loop [b 1 c 1]
      (if (> b k)
        c
        (recur (inc b) (* (/ (- a b) b) c))))))
        
(defn -binomial
  "A Java-callable wrapper around the 'binomial' function."
  [n k]
  (binomial n k))

(defn -main []
 (println (str "(binomial 5 3): " (binomial 5 3)))
  (println (str "(binomial 10042 111): " (binomial 10042 111))))
