package com.jingdianjichi.oss.service;

import com.jingdianjichi.oss.adapter.StorageAdapter;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 文件存储service
 *
 * @author: wuwenshuai
 * @date: 2024/07/14
 */
@Service
public class FileService {


    public static void main(String[] args) {
        System.out.println(1);
    }
    private final StorageAdapter storageAdapter;

    public FileService(StorageAdapter storageAdapter) {
        this.storageAdapter = storageAdapter;
    }

    /**
     * 列出所有桶
     */
    public List<String> getAllBucket() {
        return storageAdapter.getAllBucket();
    }

    /**
     * 获取文件路径
     */
    public String getUrl(String bucketName,String objectName) {
        return storageAdapter.getUrl(bucketName,objectName);
    }

    /**
     * 上传文件
     */
    public String uploadFile(MultipartFile uploadFile, String bucket, String objectName){
        storageAdapter.uploadFile(uploadFile,bucket,objectName);
        objectName = objectName + "/" + uploadFile.getOriginalFilename();
        return storageAdapter.getUrl(bucket, objectName);
    }
}

