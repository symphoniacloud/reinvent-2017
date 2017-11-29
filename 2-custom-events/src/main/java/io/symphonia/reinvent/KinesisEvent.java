package io.symphonia.reinvent;

/*
{
  "Records": [
    {
      "eventID": "shardId-000000000000:49545115243490985018280067714973144582180062593244200961",
      "eventVersion": "1.0",
      "kinesis": {
        "approximateArrivalTimestamp": 1428537600,
        "partitionKey": "partitionKey-3",
        "data": "SGVsbG8sIHRoaXMgaXMgYSB0ZXN0IDEyMy4=",
        "kinesisSchemaVersion": "1.0",
        "sequenceNumber": "49545115243490985018280067714973144582180062593244200961"
      },
      "invokeIdentityArn": "arn:aws:iam::EXAMPLE",
      "eventName": "aws:kinesis:record",
      "eventSourceARN": "arn:aws:kinesis:EXAMPLE",
      "eventSource": "aws:kinesis",
      "awsRegion": "us-east-1"
    }
  ]
}
 */

import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.List;

//public class KinesisEvent {
//
//    public List<Record> Records;
//    private BitSet records;
//
//    public BitSet getRecords() {
//        return records;
//    }
//
//    public static class Record {
//        public Kinesis kinesis;
//    }
//
//    public static class Kinesis {
//        public long approximateArrivalTimestamp;
//        public String partitionKey;
//        public ByteBuffer data;
//        public String sequenceNumber;
//    }
//}
