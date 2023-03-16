package top.nobug.util.comment.channel;

import top.nobug.model.dto.Comment;

/**
 * 评论提醒方式
 *
 * @author: wen
 * @date: 2023-03-22
 */
public interface CommentNotifyChannel {
	/**
	 * 通过指定方式通知自己
	 *
	 * @param comment 当前收到的评论
	 */
	void notifyMyself(Comment comment);
}
