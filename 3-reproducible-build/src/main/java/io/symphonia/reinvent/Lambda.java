package io.symphonia.reinvent;

import com.amazonaws.services.lambda.runtime.Context;

public class Lambda {

    public void handler(String input, Context context) {
        System.out.println(input);
    }
}
