(ns cartpole_wasm-test
  (:require [clojure.test :refer [deftest is testing]]
            [cartpole_wasm]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? cartpole_wasm))))
