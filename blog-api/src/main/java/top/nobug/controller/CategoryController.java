package top.nobug.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.nobug.annotation.VisitLogger;
import top.nobug.enums.VisitBehavior;
import top.nobug.model.vo.BlogInfo;
import top.nobug.model.vo.PageResult;
import top.nobug.model.vo.Result;
import top.nobug.service.BlogService;

/**
 * @Description: 分类
 * @Author: wen
 * @Date: 2023-01-19
 */
@RestController
public class CategoryController {
	@Autowired
	BlogService blogService;

/*	@Autowired
	CategoryService categoryService;*/

//	/**
//	 * 获取所有的分类类别
//	 * @return
//	 */
//	@VisitLogger(VisitBehavior.CATEGORY)
//	@GetMapping("/getCategory")
//	public Result getCategoryList(){
//		List<Category> categoryList=categoryService.getCategoryList();
//		return Result.ok("请求成功", categoryList);
//
//	}

	/**
	 * 根据分类name分页查询公开博客列表
	 *
	 * @param categoryName 分类name
	 * @param pageNum      页码
	 * @return
	 */
	@VisitLogger(VisitBehavior.CATEGORY)
	@GetMapping("/category")
	public Result category(@RequestParam String categoryName,
	                       @RequestParam(defaultValue = "1") Integer pageNum) {
		PageResult<BlogInfo> pageResult = blogService.getBlogInfoListByCategoryNameAndIsPublished(categoryName, pageNum);
		return Result.ok("请求成功", pageResult);
	}
}
