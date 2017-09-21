package com.birdsh.chen.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class FileUploadController {

	private static final Logger logger = LoggerFactory.getLogger(FileUploadController.class);

	// 访问路径为：http://127.0.0.1:8080/file
	@RequestMapping("/file")
	public String file() {
		return "/file";
	}

	/**
	 * 文件上传具体实现方法;
	 * 
	 * @param file
	 * @return
	 */
	@RequestMapping("/upload")
	@ResponseBody
	public String handleFileUpload(@RequestParam("file") MultipartFile file) {
		// 按照文件来进行上传
		if (file.isEmpty()) {
			return "文件为空";
		} else {
			// 获取文件名
			String fileName = file.getOriginalFilename();
			logger.info("上传的文件名为：" + fileName);
			// 获取文件的后缀名
			String suffixName = fileName.substring(fileName.lastIndexOf("."));
			logger.info("上传的后缀名为：" + suffixName);
			// 文件上传后的路径
			String filePath = "D://files//";
			// 解决中文问题，liunx下中文路径，图片显示问题
			// fileName = UUID.randomUUID() + suffixName;
			File dest = new File(filePath + fileName);
			// 检查是否存在此目录
			if (!dest.getParentFile().exists()) {
				dest.getParentFile().mkdirs();
			}
			try {
				file.transferTo(dest);
				return "上传成功！";
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "上传失败";
		}

		// 按照字节流来上传
		// if (!file.isEmpty()) {
		// try {
		// /*
		// * 这段代码执行完毕之后，图片上传到了工程的跟路径； 大家自己扩散下思维，如果我们想把图片上传到
		// * d:/files大家是否能实现呢？ 等等;
		// * 这里只是简单一个例子,请自行参考，融入到实际中可能需要大家自己做一些思考，比如： 1、文件路径； 2、文件名；
		// * 3、文件格式; 4、文件大小的限制;
		// */
		// BufferedOutputStream out = new BufferedOutputStream(
		// new FileOutputStream(new File(file.getOriginalFilename())));
		// out.write(file.getBytes());
		// out.flush();
		// out.close();
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// return "上传失败," + e.getMessage();
		// } catch (IOException e) {
		// e.printStackTrace();
		// return "上传失败," + e.getMessage();
		// }
		// return "上传成功";
		// } else {
		// return "上传失败，因为文件是空的.";
		// }

		
	}
	
	// 访问路径为：http://127.0.0.1:8080/mutifile
		@RequestMapping("/mutifile")
		public String batchFile() {
			return "/mutifile";
		}
	/**
	 * 多文件具体上传时间，主要是使用了MultipartHttpServletRequest和MultipartFile
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/batch/upload", method = RequestMethod.POST)
	public @ResponseBody String handleFileUpload(HttpServletRequest request) {
		List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
		MultipartFile file = null;
		BufferedOutputStream stream = null;
		for (int i = 0; i < files.size(); ++i) {
			file = files.get(i);
			if (!file.isEmpty()) {
				try {
					// 获取文件名
					String fileName = file.getOriginalFilename();
			        System.out.println("上传的文件名fileName:" + fileName);
			     // 截取上传文件的文件名的前缀
			        String uploadFilePrfix = fileName.substring(fileName.lastIndexOf('\\') + 1,fileName.indexOf('.'));
			        System.out.println("文件的前缀：" + uploadFilePrfix);
			        // 截取上传文件的后缀
			          String uploadFileSuffix = fileName.substring(fileName.indexOf('.') + 1, fileName.length());
			          System.out.println("文件的后缀:" + uploadFileSuffix);
			          stream = new BufferedOutputStream(new FileOutputStream(new File("D://files//" + uploadFilePrfix + "." + uploadFileSuffix)));
					byte[] bytes = file.getBytes();
					//把文件按字节写入stream对应的文件
					stream.write(bytes);
					stream.close();
				} catch (Exception e) {
					stream = null;
					return "You failed to upload " + i + " => " + e.getMessage();
				}
			} else {
				return "You failed to upload " + i + " because the file was empty.";
			}
		}
		return "upload successful";
	}
}
