/**
 * 
 */
package com.odin.commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * @author Brian
 *
 */
public class PingCommand extends Commands {

	/* (non-Javadoc)
	 * @see com.odin.commands.Commands#called(java.lang.String[], net.dv8tion.jda.core.events.message.MessageReceivedEvent)
	 */
	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		
		return true;
	}

	/* (non-Javadoc)
	 * @see com.odin.commands.Commands#help()
	 */
	@Override
	public String help() {
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.odin.commands.Commands#action(java.lang.String[], net.dv8tion.jda.core.events.message.MessageReceivedEvent)
	 */
	@Override
	public void action(String[] args, MessageReceivedEvent event) {
		try {
			event.getTextChannel().sendMessage("The Sleeping Hobo rolls over and farts" ).queue();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
