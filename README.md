# Interview sbt example

A minimal Scala / sbt starter for a live coding interview. 

## Prerequisites

- JDK 11 or newer
- [sbt](https://www.scala-sbt.org/) 1.x

Verify:
```
java  -version
sbt   --version
```

## Running

Enter the sbt shell once (fast after the first start):
```
sbt
```

Then, inside the shell:
```
compile              # build only
test                 # run the test suite
run                  # execute Main
```

Or one-shot from your normal shell:
```
sbt test
sbt run
```
