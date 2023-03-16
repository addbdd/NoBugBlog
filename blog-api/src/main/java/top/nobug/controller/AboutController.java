package top.nobug.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.nobug.annotation.VisitLogger;
import top.nobug.enums.VisitBehavior;
import top.nobug.model.vo.Result;
import top.nobug.service.AboutService;

/**
 * @Description: 关于我页面
 * @Author: wen
 * @Date: 2023-01-31
 */
@RestController
public class AboutController {
	@Autowired
	AboutService aboutService;

	/**
	 * 获取关于我页面信息
	 *
	 * @return
	 */
	@VisitLogger(VisitBehavior.ABOUT)
	@GetMapping("/about")
	public Result about() {
		return Result.ok("获取成功", aboutService.getAboutInfo());
	}
}
