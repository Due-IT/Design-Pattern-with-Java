package facade;

import some_complex_mdeia_library.*;

import java.io.File;

/*
퍼사드 패턴의 핵심.
하위 시스템의 복잡하고 정교한 기능들을 조합해 클라이언트가 사용하기 편하도록 기능을 제공한다.
*/
public class VideoConversionFacade {
    public File convertVideo(String fileName, String format){
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
