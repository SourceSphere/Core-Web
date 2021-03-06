package br.com.sourcesphere.core.web.generic.controller;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

import br.com.sourcesphere.core.web.generic.service.MasterService;

/**
 * The Master Controller
 * @author Guilherme Dio
 *
 * @param <T> - Type of the entity to be used
 */
public abstract class MasterController<T> extends Controller
{
	/**
	 * Logger
	 */
	protected final Logger log = Logger.getLogger(MasterController.class);
	
	/**
	 * The service to be used
	 */
	protected final MasterService<T> service;
	
	/**
	 * Constructs the Master Controller with an service that must be injected
	 * @param service
	 */
	public MasterController(MasterService<T> service)
	{
		this.service = service;
	}
	
	/**
	 * Add an entity to the system
	 * @param Entity to be added on the system
	 */
	protected void add(T entidade)
	{
		getService().add(entidade);
	}
	
	/**
	 * Modify an entity on the system
	 * @param Entity to be modified on the system
	 */
	protected void alter(T entity)
	{
		getService().alter(entity);
	}
	
	/**
	 * Removes an entity on the system
	 * @param Entity to be deleted from the system
	 */
	protected void delete(T entity)
	{
		getService().delete(entity);
	}
	
	/**
	 * Find an entity by an unique identifier
	 * @param identifier
	 * @return Identified entity
	 */
	protected T get(Serializable identifier)
	{
		return getService().get(identifier);
	}
	
	/**
	 * Identify all the entities with limited number of collection and a first position to look for
	 * @return List of the entity
	 */
	protected List<T> listAll(Integer firstResult,Integer maxResults)
	{
		return getService().listAll(firstResult,maxResults);
	}
	
	/**
	 * Identify all the entities with limited number of collection
	 * @return List of the entity
	 */
	protected List<T> listAll(Integer maxResults)
	{
		return listAll(0,maxResults);
	}
	
	/**
	 * Identify all the entities
	 * @return List of the entity
	 */
	protected List<T> listAll()
	{
		return listAll(0);
	}
	
	/**
	 * Gets the service being used
	 * @return  A business service
	 */
	protected MasterService<T> getService() 
	{
		return this.service;
	}
	
	public String getView(String view)
	{
		return getBase()+view;
	}

	public String getGenericAttributeIdentifier() 
	{
		return "response"+getClass().getSimpleName();
	}
}