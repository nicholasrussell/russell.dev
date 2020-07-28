(ns dev.russell.routes.home
  (:require
   [dev.russell.layout :as layout]
   [clojure.java.io :as io]
   [dev.russell.middleware :as middleware]
   [ring.util.response]
   [ring.util.http-response :as response]))

(defn home-page [request]
  (layout/render request "home.html" {:docs (-> "docs/page.md" io/resource slurp)}))

(defn home-routes []
  [""
   {:middleware [middleware/wrap-csrf
                 middleware/wrap-formats]}
   ["/" {:get home-page}]])

