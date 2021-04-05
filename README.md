# my Journey

- Data Oriented Application
- Functional Programming approach

## re<frame>

```clojure
(def app-db  (reagent/atom {}))

(defn h
  [{:keys [db]} [_ item-id]]
  {:db  (dissoc-in db [:items item-id])})

(-> db
   (assoc :errors errors
          :data data))
```

How to debug?

## Commands

```clojure
lein new re-frame journey +10x
```
