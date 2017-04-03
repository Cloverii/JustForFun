This is my code challenge for GSoc 2017 Project Idea [**Simple Features for protobuf and others**](https://wiki.52north.org/Projects/GSoC2017ProjectIdeas#Simple_Features_for_protobuf_and_others)

- public static FeatureCollection parse(String json) throws InvalidProtocolBufferException
Read a JSON String, return a FetureCollection Object
- public static String print(FeatureCollection fc) throws InvalidProtocolBufferException
Read a FeatureCollection Object, return a JSON String

The test takes the file 'geo.json' as input, parse the JSON String of geometry to an object, and decode it into a file named 'output'.
