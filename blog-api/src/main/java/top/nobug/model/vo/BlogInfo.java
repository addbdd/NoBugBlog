package top.nobug.model.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import top.nobug.entity.Category;
import top.nobug.entity.Tag;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Description: 博客简要信息
 * @Author: wen
 * @Date: 2023-01-12
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BlogInfo {
	private Long id;
	private String title;//文章标题
	private String description;//描述
	private Date createTime;//创建时间
	private Integer views;//浏览次数
	private Integer words;//文章字数
	private Integer readTime;//阅读时长(分钟)
	private Boolean top;//是否置顶
	private String password;//文章密码
	private Boolean privacy;//是否私密文章

	private Category category;//文章分类
	private List<Tag> tags = new ArrayList<>();//文章标签
}
