package com.example.testminio;

import io.minio.MinioClient;
import io.minio.UploadObjectArgs;

public class FileUploader {
    public static void main(String[] args) throws Exception {
        MinioClient minioClient =
                MinioClient.builder()
//                        .endpoint("http://minio.java8.icu:9000")
                        .endpoint("https://oss-cn-beijing.aliyuncs.com")
                        .credentials("LTAI5tJ9scBXxsk4VjYDiupv",
                                "THckQsWudA7rNV0hUXn2Hcxu0VHhLC")
                        .build();


        minioClient.uploadObject(
                UploadObjectArgs.builder()
                        .bucket("video-share-bucket")
                        .object(System.currentTimeMillis() + ".pdf")
                        .filename("C:\\Users\\thedoflin\\Downloads\\Sergio_Silva_License_Plate_Detection_ECCV_2018_paper.pdf")
                        .build());
    }
}
