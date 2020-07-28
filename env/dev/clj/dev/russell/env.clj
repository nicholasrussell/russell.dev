(ns dev.russell.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [dev.russell.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[dev.russell started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[dev.russell has shut down successfully]=-"))
   :middleware wrap-dev})
