package top.nobug.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description: 关键字搜索博客
 * @Author: wen
 * @Date: 2023-02-06
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SearchBlog {
	private Long id;
	private String title;
	private String content;
}
