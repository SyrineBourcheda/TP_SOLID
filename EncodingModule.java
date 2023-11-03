package com.directi.training.dip.exercise_refactoring;

import java.io.IOException;

public class EncodingModule {
    private final EncodingService encodingService;

    public EncodingModule(EncodingService encodingService) {
        this.encodingService = encodingService;
    }

    public void encodeData() throws IOException {
        encodingService.encode();
    }
}
