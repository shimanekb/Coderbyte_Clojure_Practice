(ns second-greatlow.greatlow)

(def take-next-two (comp (partial drop 1) (partial take 3)))

(defn find-second-greatlow [coll]
  "Takes a collection of numerals and finds the 2nd and 3rd greatest numbers"
  (let [sorted-coll (sort > coll)]
        (if (< (count coll) 3)
          sorted-coll
          (take-next-two coll))))


