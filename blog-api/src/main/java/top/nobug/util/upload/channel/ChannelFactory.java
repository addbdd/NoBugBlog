package top.nobug.util.upload.channel;

import top.nobug.constant.UploadConstants;
import top.nobug.util.common.SpringContextUtils;

/**
 * 文件上传方式
 *
 * @author: wen
 * @date: 2023-03-23
 */
public class ChannelFactory {
	/**
	 * 创建文件上传方式
	 *
	 * @param channelName 方式名称
	 * @return 文件上传Channel
	 */
	public static FileUploadChannel getChannel(String channelName) {
		switch (channelName.toLowerCase()) {
			case UploadConstants.LOCAL:
				return SpringContextUtils.getBean(LocalChannel.class);
		}
		throw new RuntimeException("Unsupported value in [application.properties]: [upload.channel]");
	}
}
