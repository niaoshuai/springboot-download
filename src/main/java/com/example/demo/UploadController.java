package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RequestMapping("/upload")
@Controller
public class UploadController {

    @PostMapping
    @ResponseBody
    public UploadDto upload(MultipartFile file) throws IOException {
        // 拿到文件操作
        UploadDto dto = new UploadDto();
        dto.setIsUpload(true);
        dto.setName(file.getName());
        dto.setOriginalFilename(file.getOriginalFilename());
        dto.setBytes(file.getBytes());
        return dto;
    }
}
