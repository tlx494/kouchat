
/***************************************************************************
 *   Copyright 2006-2007 by Christian Ihle                                 *
 *   kontakt@usikkert.net                                                  *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU General Public License     *
 *   along with this program; if not, write to the                         *
 *   Free Software Foundation, Inc.,                                       *
 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.             *
 ***************************************************************************/

package net.usikkert.kouchat.net;

//import static org.junit.Assert.*;

import net.usikkert.kouchat.event.MessageListener;
import net.usikkert.kouchat.misc.NickDTO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MessageParserTest implements MessageListener
{
	private MessageParser msgParser;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		
	}

	@Before
	public void setUp() throws Exception
	{
		msgParser = new MessageParser( this );
	}

	@After
	public void tearDown() throws Exception
	{
		
	}

	@Test
	public void testMessageParser()
	{
		// Already done that...
	}

	@Test
	public void testStop()
	{
		msgParser.stop();
	}

	@Test
	public void testRestart()
	{
		msgParser.restart();
	}

	@Test
	public void testMessageArrived()
	{
		msgParser.messageArrived( "15626995!LOGON#Snoopy:", "nilseteip" );
		msgParser.messageArrived( "1951650c!PING_Snoopy:", "nilseteip" );
	}

	@Override
	public void awayChanged( int userCode, boolean away, String awayMsg )
	{

	}

	@Override
	public void exposeRequested()
	{

	}

	@Override
	public void fileSend( int userCode, long byteSize, String fileName, String user, int fileHash, int fileCode )
	{

	}

	@Override
	public void fileSendAborted( int userCode, String fileName, int fileHash )
	{

	}

	@Override
	public void fileSendAccepted( int userCode, String fileName, int fileHash, int port )
	{

	}

	@Override
	public void meIdle()
	{

	}

	@Override
	public void meLogOn( String ipAddress )
	{

	}

	@Override
	public void messageArrived( int userCode, String msg, int color )
	{

	}

	@Override
	public void nickChanged( int userCode, String newNick )
	{

	}

	@Override
	public void nickCrash()
	{

	}

	@Override
	public void topicChanged( int userCode, String newTopic, String nick, long time )
	{

	}

	@Override
	public void topicRequested()
	{

	}

	@Override
	public void userExposing( NickDTO user )
	{

	}

	@Override
	public void userIdle( int userCode )
	{

	}

	@Override
	public void userLogOff( int userCode )
	{

	}

	@Override
	public void userLogOn( NickDTO newUser )
	{

	}

	@Override
	public void writingChanged( int userCode, boolean writing )
	{

	}
}