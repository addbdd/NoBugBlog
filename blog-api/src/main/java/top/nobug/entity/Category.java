package top.nobug.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 博客分类
 * @Author: wen
 * @Date: 2023-01-06
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Category {
	private Long id;
	private String name;//分类名称
	private List<Blog> blogs = new ArrayList<>();//该分类下的博客文章
}
