package br.com.sourcesphere.core.web.generic.dao.exception;

public class EntityAlreadyExistException extends DaoException 
{
	/**
	 * Generated SerialUID
	 */
	private static final long serialVersionUID = -4807674073290239906L;
	
	public EntityAlreadyExistException(String msg)
	{
		super(msg);
	}

	public EntityAlreadyExistException(Throwable cause)
	{
		super(cause);
	}
	
	public EntityAlreadyExistException(String msg,Throwable cause)
	{
		super(msg, cause);
	}
}
