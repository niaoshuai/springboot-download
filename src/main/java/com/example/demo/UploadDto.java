package com.example.demo;

import lombok.Data;

@Data
public class UploadDto {
    private Boolean isUpload;
    private String name;
    private String originalFilename;
    private byte[] bytes;
}
