Run the benchmarks yourself via:

    sbt 'it:test'

Results
-------

```
::Benchmark Array.map(..).toMap::         ::Benchmark Map.sequence::
cores: 4
hostname: nucky
jvm-name: OpenJDK 64-Bit Server VM
jvm-vendor: Oracle Corporation
jvm-version: 24.79-b02
os-arch: amd64
os-name: Linux
Parameters(size -> 100000): 6.394624      Parameters(size -> 100000): 3.995605
Parameters(size -> 200000): 12.794573     Parameters(size -> 200000): 7.986022
Parameters(size -> 300000): 19.187619     Parameters(size -> 300000): 11.978428
Parameters(size -> 400000): 25.496566     Parameters(size -> 400000): 15.974551
Parameters(size -> 500000): 31.866138     Parameters(size -> 500000): 19.970838
```
