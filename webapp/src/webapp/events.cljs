(ns webapp.events
  (:require
   [re-frame.core :as re-frame]
   [webapp.db :as db]
   [day8.re-frame.tracing :refer-macros [fn-traced]]))

(re-frame/reg-event-db
 ::initialize-db
 (fn-traced [_ _] db/default-db))

(re-frame/reg-event-db
 ::change-name
 (fn [db [_ new-name]]
  (assoc db :name new-name)))


