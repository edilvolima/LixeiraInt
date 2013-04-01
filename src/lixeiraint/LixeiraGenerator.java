package lixeiraint;

import context.arch.discoverer.query.AbstractQueryItem;
import context.arch.enactor.Generator;

/*
 * @author Zeff
 */
public class LixeiraGenerator extends Generator {
    
    public LixeiraGenerator(AbstractQueryItem<?,?> outWidgetQuery, String id) {
		super(outWidgetQuery, "LixeiraSensores", id);
		start();
	}
    
}
