package com.hpsgts.utils;


/**
 * Created by Plain on 2017/6/20.
 */
public class OSSUtils {
//    private static Logger logger = Logger.getLogger(OSSUtils.class);
//    private static String endpoint = "http://oss-cn-shanghai.aliyuncs.com";
//
//    // accessKeyId和accessKeySecret是OSS的访问密钥，您可以在控制台上创建和查看，
//    // 创建和查看访问密钥的链接地址是：https://ak-console.aliyun.com/#/。
//    // 注意：accessKeyId和accessKeySecret前后都没有空格，从控制台复制时请检查并去除多余的空格。
//    private static String accessKeyId = "LTAIWVBu27n5Vw0d";
//    private static String accessKeySecret = "18i7N4uSuLMlICX3Lk7r98uVOWPz4b";
//
//    // Bucket用来管理所存储Object的存储空间，详细描述请参看“开发人员指南 > 基本概念 > OSS基本概念介绍”。
//    // Bucket命名规范如下：只能包括小写字母，数字和短横线（-），必须以小写字母或者数字开头，长度必须在3-63字节之间。
//    private static String bucketName = "shandai-app-oss";
//    private static String filedir = "";
//    private static OSSClient ossClient;
//
//    /**
//     * 图片上传, 阿里云OSS储存方式
//     *
//     * @param request
//     * @param response
//     * @param file
//     * @return 返回图片在阿里云的绝对路劲
//     * @throws Throwable
//     */
//    public static String uploadFiles(HttpServletRequest request, HttpServletResponse response, MultipartFile file, String filedirs) {
//        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
////        ossClient.createBucket(bucketName);
//
//        try {
//
//            // 判断Bucket是否存在。详细请参看“SDK手册 > Java-SDK > 管理Bucket”。
//            // 链接地址是：https://help.aliyun.com/document_detail/oss/sdk/java-sdk/manage_bucket.html?spm=5176.docoss/sdk/java-sdk/init
//            if (!ossClient.doesBucketExist(bucketName)) {
//                ossClient.createBucket(bucketName);
//            }
//
//            // 查看Bucket信息。详细请参看“SDK手册 > Java-SDK > 管理Bucket”。
//            // 链接地址是：https://help.aliyun.com/document_detail/oss/sdk/java-sdk/manage_bucket.html?spm=5176.docoss/sdk/java-sdk/init
//            BucketInfo info = ossClient.getBucketInfo(bucketName);
//            System.out.println("Bucket " + bucketName + "的信息如下：");
//            System.out.println("\t数据中心：" + info.getBucket().getLocation());
//            System.out.println("\t创建时间：" + info.getBucket().getCreationDate());
//            System.out.println("\t用户标志：" + info.getBucket().getOwner());
//            // 上传文件流
//            ossClient.putObject(bucketName, filedirs, file.getInputStream());
//
//
//
//
//            // 查看Bucket中的Object。详细请参看“SDK手册 > Java-SDK > 管理文件”。
//            // 链接地址是：https://help.aliyun.com/document_detail/oss/sdk/java-sdk/manage_object.html?spm=5176.docoss/sdk/java-sdk/manage_bucket
//            ObjectListing objectListing = ossClient.listObjects(bucketName);
//            List<OSSObjectSummary> objectSummary = objectListing.getObjectSummaries();
//            System.out.println("您有以下Object：");
//            for (OSSObjectSummary object : objectSummary) {
//                System.out.println("\t" + object.getKey());
//            }
//
//        } catch (OSSException oe) {
//            oe.printStackTrace();
//        } catch (ClientException ce) {
//            ce.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            ossClient.shutdown();
//        }
//
//        logger.info("Completed");
//        // 设置URL过期时间为10年  3600l* 1000*24*365*10
//        Date expiration = new Date(new Date().getTime() + 3600l * 1000 * 24 * 365 * 10);
//        // 生成URL
//        URL url = ossClient.generatePresignedUrl(bucketName, filedirs, expiration);
//        System.out.println(url.toString());
//        return url.toString();
//    }
}
