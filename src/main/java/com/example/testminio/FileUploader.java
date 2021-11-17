package com.example.testminio;

import io.minio.MinioClient;
import io.minio.UploadObjectArgs;

public class FileUploader {
    public static void main(String[] args) throws Exception {
        MinioClient minioClient =
                MinioClient.builder()
                        //AWS
//                        .region("ap-northeast-1")
//                        .endpoint("https://s3.ap-northeast-1.amazonaws.com")
//                        .credentials("AKIA3T7OC6BJUXVN3NXV", "z1HzN4QK8j8l0kT0H9uawxLnNO03zXv/tgRIfk23")

                        //阿里云
//                        .region("cn-beijing")
//                        .endpoint("https://oss-cn-beijing.aliyuncs.com")
//                        .credentials("LTAI5t8WesPNu1dDLaRmSWt8", "a45nM6ra07b203fXoZ7TKf3POJyYEi")

                        //腾讯云
                        .region("ap-beijing")
                        .endpoint("https://cos.ap-beijing.myqcloud.com")
                        .credentials("AKIDrYdYFhurY0DBwRggSzHL9hz3rPhjW4MP",
                                "pOilY5MMyVlkSu50f4C4fgT1JL8fwxjG")

                        .build();

        String objectName = System.currentTimeMillis() + ".txt";
        minioClient.uploadObject(
                UploadObjectArgs.builder()
//                        .bucket("test-s3-bucket-tokyo")
//                        .bucket("chat-oss-bucket")
                        .bucket("bucket-1253319037")
                        .object(objectName)
                        .filename("C:\\Users\\thedoflin\\Downloads\\helloworld.txt")
                        .build());

    }
}
