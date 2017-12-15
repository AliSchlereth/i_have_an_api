(ns i-have-an-api.core
    (:require [clj-http.client :as client]
              [clojure.data.json :as json]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn extract-JSON
  [response-body]
  (println (json/read-str response-body)))

(defn get-endpoint
  "get api endpoint"
  [endpoint]
    (:body
      (client/get endpoint)))

(defn process-endpoint
  [url]
  (println
    (extract-JSON
      (get-endpoint url))))

(defn -main
  []
  (foo "Ali")
  (process-endpoint "https://edualize.herokuapp.com/api/v1/median_expenditures/totals"))


(-main)
