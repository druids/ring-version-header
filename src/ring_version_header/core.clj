(ns ring-version-header.core
  (:require
    [ring.util.response :as resp]))


(defn wrap-version-header
  "A middleware that adds a given `version` into `X-Version` header."
  [handler version]
  (fn [request]
    (-> request handler (resp/header "X-Version" version))))
