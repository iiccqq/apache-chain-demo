package com.demo.chain;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.chain.Command;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.demo.chain.command.LoginCheck;
import com.demo.chain.command.TokenCheck;

@Configuration
@ImportResource(locations={"classpath:application-bean.xml"})
public class Config {

	/*@Bean("commands")
	public List<Command> getCommands() {
		List<Command> commands = new ArrayList<Command>();		
		commands.add(new LoginCheck());
		commands.add(new TokenCheck());
		return commands;

	}*/
}
