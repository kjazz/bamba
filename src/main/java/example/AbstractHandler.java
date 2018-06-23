public class AbstractHandler 
{
	/**This is a very traditional method, you
 * 	 * can obtain the dynamic object by using
 * 	 	 * several if conditions.
 * 	 	 	 * @param handlerName 
 * 	 	 	 	 * @return an object of type {@link Handler}
 * 	 	 	 	 	 */
	public static Handler getHandler( String handlerName )
	{
		Handler handler = null;
		try
		{
			if( handlerName.equals("A"))
				handler = new AHandler();
			if( handlerName.equals("B") )
				handler = new BHandler();
			if( handlerName.equals("C"))
                                handler = new AHandler();
                        if( handlerName.equals("D") )
                                handler = new BHandler();
			
		}
		catch( Exception e )
		{
			System.out.println("There is no specific handler");
		}
		return handler;
	}

}
