Run the benchmarks yourself via:

    sbt 'it:test'

Results
-------

```
::Benchmark List.map(f).toMap::           ::Benchmark List.mapToMap(f)::
cores: 4
hostname: nucky
jvm-name: OpenJDK 64-Bit Server VM
jvm-vendor: Oracle Corporation
jvm-version: 24.85-b03
os-arch: amd64
os-name: Linux
Parameters(size -> 300000): 11.929356     Parameters(size -> 300000): 8.580915
Parameters(size -> 400000): 15.862726     Parameters(size -> 400000): 11.449164
Parameters(size -> 500000): 19.783415     Parameters(size -> 500000): 14.248663
Parameters(size -> 600000): 23.833078     Parameters(size -> 600000): 17.083376
Parameters(size -> 700000): 27.709485     Parameters(size -> 700000): 19.937645
```
