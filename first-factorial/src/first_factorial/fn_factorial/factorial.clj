(ns first-factorial.fn-factorial.factorial)

(defn factorial [number]
  "will return factorial for a given Integer"
  (loop [x number result 1]
    (if (< x 1)
      result
      (recur (dec x) (* result x)))))
