package com.gsr.botclient.client;

public class BotProtocol {

	private static final String moveMouseHeader = "mM";
	private static final String clickLeftMouseHeader = "cL";
	private static final String clickRightMouseHeader = "cR";
	private static final String scrollMouseHeader = "sr";
	private static final String writeTextHeader = "wT";
	private static final String delimiter = "&"; 

	public static String getMoveMouseMessage(Integer deltaX, Integer deltaY) {

		String result = null;

		if (deltaX != null && deltaY != null) {
			result = BotProtocol.moveMouseHeader + "&" + deltaX + BotProtocol.delimiter + deltaY;
		}

		return result;
	}

	public static String getScrollMessage(Integer scroll) {

		String result = null;

		if (scroll != null) {
			result = BotProtocol.scrollMouseHeader + "&" + scroll;
		}

		return result;		
	}

	public static String getClickLeftButtonMessage() {
		return BotProtocol.clickLeftMouseHeader;
	}

	public static String getClickRightButtonMessage() {
		return BotProtocol.clickRightMouseHeader;
	}

	public static String getWriteTextMessage(String text) {

		String result = null;

		if (text != null) {
			result = BotProtocol.writeTextHeader +  "&" +  text;
		}

		return result;
	}

}
