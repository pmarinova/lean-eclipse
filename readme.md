What is Lean Eclipse?
=====================

A custom Eclipse distribution for Java EE development with minimal included features. The distribution contains the following components:
* Eclipse Platform
* Java EE
* Git Integration
* Maven Integration (+ integration for Java EE)

All components are with their latest version taken from https://download.eclipse.org/releases/2021-03/.


Why Lean Eclipse?
=================

Because we needed a minimal Eclipse distribution for Java EE without all the feature bloat that is included in the official Java EE release.
Because a custom distribution allows us to build our own Eclipse and customize it however we want.


How to build
============

You can build the product with maven:
`mvn clean package`

Look for the generated zip file:
`pm.eclipse.lean.product/target/products/pm.eclipse.lean.product-*.zip`

NOTE: Currently the build is platform dependent so if you build under Linux you'll get a Linux product.