package com.marketing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//controller
//apoorva friend
//sudhansu//dtythrytrythhd

public class ConductController {
	@RequestMapping("/hi")
	public int viewMsg() {
		return 10 ;
	}

}
