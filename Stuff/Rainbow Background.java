/**

        FLASHING LIGHTS WARNING

*/

	public static int rainbowBG() {
		Gui gui = new Gui();
		Minecraft mc = Minecraft.getMinecraft();
	    	long time = System.currentTimeMillis();
	    	int color = Color.HSBtoRGB(time % (int) 10000.0F / 10000.0F, 0.8F, 0.7F);
		return color;
	}
