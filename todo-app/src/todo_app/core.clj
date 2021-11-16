(ns todo-app.core)

  (defn say-hello
    [name]
    (def todo-list (atom {}))
    (swap! todo-list assoc :list name)
    (swap! todo-list assoc :list "mehenwal")
    (swap! todo-list assoc :list "xdsa")
    (println @todo-list))
  

  (defn main
   ([]        (println "no arguments"))
   ([name]    (say-hello name)))

