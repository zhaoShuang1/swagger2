package com.zs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zs.entity.BaseRequsetVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;


/**
	 * Swagger使用的注解及其说明：
	@Api：用在类上，说明该类的作用。
	@ApiOperation：注解来给API增加方法说明。
	@ApiImplicitParams : 用在方法上包含一组参数说明。
	@ApiImplicitParam：用来注解来给方法入参增加说明。
	@ApiResponses：用于表示一组响应
	@ApiResponse：用在@ApiResponses中，一般用于表达一个错误的响应信息
	    l   code：数字，例如400
	    l   message：信息，例如"请求参数没填好"
	    l   response：抛出异常的类   
	@ApiModel：描述一个Model的信息（一般用在请求参数无法使用@ApiImplicitParam注解进行描述的时候）
    l   @ApiModelProperty：描述一个model的属性
    
    paramType：指定参数放在哪个地方
		header：请求参数放置于Request Header，使用@RequestHeader获取
		query：请求参数放置于请求地址，使用@RequestParam获取
		path：（用于restful接口）-->请求参数的获取：@PathVariable
		body：（不常用）
		form（不常用）
	name：参数名
	dataType：参数类型
	required：参数是否必须传 true | false
	value：说明参数的意思
	defaultValue：参数的默认值
 * @author zs
 * @date 2019年3月25日
 */
@RestController
@RequestMapping("/")
@Api("测试")
public class TestSwaggerController {
	
	@RequestMapping("/method1")
	@ApiOperation(value="method 1 summary " ,notes="method1 notes")
	@ApiImplicitParam(paramType="query",dataType="java.lang.String",name="name" ,value="名称" ,required=true,defaultValue="defaultName")
	public Object method1(@RequestParam(value = "name",required=true)String name) {
		System.out.println("method1 called --------------------------------------------------,param:"+name);
		return name;
	}
	
	@RequestMapping("/method2")
	@ApiOperation(value="method 2 summary" ,notes="method2 notes")
	@ApiImplicitParams(value= {
			@ApiImplicitParam(paramType="query",dataType="java.lang.String",name="service",value="服务名",required=true),
			@ApiImplicitParam(paramType="query",dataType="java.lang.String",name="login_name",value="登录名",required=true),
			@ApiImplicitParam(paramType="query",dataType="java.lang.String",name="pid",value="partnerid",required=true),
			@ApiImplicitParam(paramType="query",dataType="java.lang.String",name="sign",value="验签",required=true)
	})
	public Object method2(BaseRequsetVo req) {
		System.out.println("method2 called --------------------------------------------------,param:"+req.toString());
		return req.toString();
	}
}
