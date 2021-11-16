(ns webapp.views
  (:require
   [re-frame.core :as re-frame]
   [webapp.subs :as subs]
   ))

(defn sample-component []
  [:div.card [:footer.card-footer [:a.card-footer-item {:href "#"} "save"]]])

(defn extract-attr [el]
  ;; (cljs.pprint/pprint [1 2 3])
  (.log js/console el)
  )

(defn button []
  (let [b-id "b1"] 
  [:div 
   [:button 
    {:data-animal-type "bird" :id b-id :type "button" :on-click (fn [_] (apply extract-attr _))}
    "Click Me!"]]))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1
      "Hello from " @name]
     [button]
     [sample-component]]))
