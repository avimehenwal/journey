(ns webapp.views
  (:require
   [re-frame.core :as re-frame]
   [webapp.events :as events]
   [re-com.core :as re-com :refer [at]]
   [webapp.subs :as subs]))

(defn title []
  (let [name (re-frame/subscribe [::subs/name])]
    [re-com/title
     :src   (at)
     :label (str "Hello from " @name)
     :level :level1]))

(defn button []
  [:button
    {:type "button"
    :on-click #(re-frame/dispatch [::events/change-name "avi"])}
   "Click Me!"])

(defn main-panel []
  [re-com/v-box
   :src      (at)
   :height   "100%"
   :children [[title] [button]]])

