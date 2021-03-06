# Building TapData

To build the TapData you will need the following software :

- Git 1.8.3+
- JDK 8+
- Maven 3.3.9+
- Node 0.10.32+1 ([nodejs.org](https://nodejs.org/en/))
    - npm
    - bower 1.8.2+
    - grunt-cli

## Prerequisite Tasks for Building Data Collector

- You can get the latest code from Github

```
  git clone https://github.com/tjworks/tapdata.git
```

- Install datacollector-api and datacollector-plugin-api

```
  cd datacollector-api
  mvn package install -DskipTests
```
and
```
  cd ../datacollector-plugin-api
  mvn package install -DskipTests
```

## Build

- From within the Data Collector directory, execute
```
  mvn package -Pdist -DskipTests
```

- Then execute
```
  ./build.sh
```

- To start/restart TapData,execute
```
  ./dist/target/tapdata/bin/tapdata dc
  ./dist/target/tapdata/bin/tapdata rs
```
