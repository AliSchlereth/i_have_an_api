(ns i-have-an-api.core
    (:require [clj-http.client :as client]
              [clojure.data.json :as json]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn extract-JSON
  [response-body]
  (get (json/read-str response-body) "value1"))


(defn get-endpoint
  "get api endpoint"
  [endpoint]
  (println (client/get endpoint)))

(defn -main
  []
  (foo "Ali")
  (get-endpoint "https://edualize.herokuapp.com/api/v1/median_expenditures/totals"))


(-main)
