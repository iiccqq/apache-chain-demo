package com.demo.chain.command;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.springframework.stereotype.Component;

@Component
public class TokenCheck implements Command {

	public boolean execute(Context context) throws Exception {
		System.out.println("checkToken");
		return false;
	}
}