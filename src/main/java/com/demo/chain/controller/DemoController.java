package com.demo.chain.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.chain.Chain;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.commons.chain.impl.ChainBase;
import org.apache.commons.chain.impl.ContextBase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

	@Resource
	List<Command> commands;
	
	@RequestMapping("sayHello")
	public String sayHello(HttpServletRequest request) {

	
		Chain chain = new ChainBase(commands);
		Context c = new ContextBase();
		try {
			chain.execute(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "sayHello";
	}
}
