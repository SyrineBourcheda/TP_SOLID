package com.directi.training.dip.exercise_refactoring;

import java.io.IOException;
import java.util.Base64;

public class FileEncodingService implements EncodingService{
	 private final Reader reader;
	    private final Writer writer;

	    public FileEncodingService(Reader reader, Writer writer) {
	        this.reader = reader;
	        this.writer = writer;
	    }

	    @Override
	    public void encode() throws IOException {
	        String input = reader.read();
	        // Code pour encoder les données (par exemple, utilisation de Base64)
	        String encodedData = Base64.getEncoder().encodeToString(input.getBytes());
	        writer.write(encodedData);
	    }

}
