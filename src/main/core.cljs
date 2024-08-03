(ns core (:require
          ["react" :as react]
          ["react-dom" :as react-dom]))

(defn main []
  (let [app-node (.getElementById js/document "app")]
    (.render react-dom "Hello World!" app-node)))
(main)