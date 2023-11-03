package com.directi.training.dip.exercise_refactoring;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class NetworkReader implements Reader{
    private final String url;

    public NetworkReader(String url) {
        this.url = url;
    }

    @Override
    public String read() throws IOException {
        // Lire depuis un réseau
        URL urlObject = new URL(url);
        try (InputStream in = urlObject.openStream()) {
            StringBuilder inputString1 = new StringBuilder();
            int c;
            c = in.read();
            while (c != -1) {
                inputString1.append((char) c);
                c = in.read();
            }
            return inputString1.toString();
        }
    }


}
