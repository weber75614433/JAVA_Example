package org.example;

import java.io.IOException;
import java.io.OutputStream;

public class RedirectingOutputStream extends OutputStream {

    private Frame frame;

    public RedirectingOutputStream(Frame frame){
        this.frame = frame;
    }

    @Override
    public void write(int b){
        frame.appendText(String.valueOf((char) b));
    }
}
