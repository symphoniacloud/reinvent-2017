package io.symphonia.reinvent;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.KinesisEvent;

public class Lambda {

    public void handler(KinesisEvent input, Context context) {
        System.out.println("Number of Kinesis records = " + input.getRecords().size());
//        System.out.println("Number of Kinesis records = " + input.Records.size());
    }

}
