package br.com.sourcesphere.core.web.generic.controller;

import br.com.sourcesphere.core.web.view.PathHandler;
import br.com.sourcesphere.core.web.view.ViewHandler;


public abstract class Controller implements ViewHandler,PathHandler
{
	public abstract String getGenericAttributeIdentifier();
}
