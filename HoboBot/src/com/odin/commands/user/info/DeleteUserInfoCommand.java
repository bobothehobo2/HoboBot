/**
 * 
 */
package com.odin.commands.user.info;

import com.odin.commands.Commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

/**
 * @author Brian
 *
 */
public class DeleteUserInfoCommand extends Commands {

	/* (non-Javadoc)
	 * @see com.odin.commands.Commands#called(java.lang.String[], net.dv8tion.jda.core.events.message.MessageReceivedEvent)
	 */
	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		return false;
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
		// TODO Auto-generated method stub

	}

}
