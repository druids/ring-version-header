ring-version-header
===================

A Ring's middleware that adds a version into HTTP X-Version header.

[![CircleCI](https://circleci.com/gh/druids/ring-version-header.svg?style=svg)](https://circleci.com/gh/druids/ring-version-header)
[![Dependencies Status](https://jarkeeper.com/druids/ring-version-header/status.png)](https://jarkeeper.com/druids/ring-version-header)
[![License](https://img.shields.io/badge/MIT-Clause-blue.svg)](https://opensource.org/licenses/MIT)


Leiningen/Boot
--------------

```clojure
[ring-version-header "0.0.0"]
```

Documentation
-------------

Wrap your handlers into `wrap-version-header`.

```clojure
(require '[ring-version-header.core :refer [wrap-version-header]]

(defn handler [request]
  {:response {:foo "bar"}, :headers {}})

(def app
  (wrap-version-header handler "1.0.0"))
```

And `X-Version` will be added into response headers

```clojure
{:response {:foo "bar"}, :headers {"X-Version" "1.0.0"}}
```


Contribution
------------

### Conventions

* Please follow coding style defined by [`.editorconfig`](http://editorconfig.org)
 and [The Clojure Style Guide](https://github.com/bbatsov/clojure-style-guide)
* Write [good commit messages](https://chris.beams.io/posts/git-commit/)
 and provide an issue ID in a commit message prefixed by `#`
