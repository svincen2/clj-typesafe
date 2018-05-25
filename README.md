# clj-typesafe

A Clojure library wrapping Typesafe Config.

## Usage

Usage is very similar to how you would use typesafe in Java:
```clojure
(require '[clj-typesafe.config-factory :as cf]
	 '[clj-typesafe.config :as c])
(def config (cf/load))
(c/get-string config "some.string")
(c/get-int config "some.int")
(c/get-double config "some.float")
```

## License

Copyright © 2018 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
