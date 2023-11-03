package com.directi.training.dip.exercise_refactoring;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("input.txt");
        Writer writer = new FileWriter("output.txt");
        EncodingService encodingService = new FileEncodingService(reader, writer);
        EncodingModule encodingModule = new EncodingModule(encodingService);
        encodingModule.encodeData();
        
    }
}
