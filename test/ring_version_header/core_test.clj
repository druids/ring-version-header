(ns ring-version-header.core-test
  (:require
    [clojure.test :refer [deftest is testing]]
    [ring-version-header.core :refer [wrap-version-header]]))


(deftest ring-version-header-test
  (let [handler (wrap-version-header identity "1.0.0")]
    (is (= {"X-Version" "1.0.0"}
           (-> {:headers {}, :body ""}
               handler
               :headers)))))
