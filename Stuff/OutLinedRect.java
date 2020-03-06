	public static void drawOutlinedRect(int left, int top, int right, int bottom, int rectColor, int outlineColor) {
		Gui gui = new Gui();
    	gui.drawRect(left + 1, top, right - 1, bottom, rectColor);
    	gui.drawHorizontalLine(left, right - 1, top, outlineColor);
    	gui.drawHorizontalLine(left, right - 1, bottom, outlineColor);
    	gui.drawVerticalLine(left, top, bottom, outlineColor);
    	gui.drawVerticalLine(right - 1, top, bottom, outlineColor);
    }
