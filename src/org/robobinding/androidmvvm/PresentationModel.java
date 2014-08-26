package org.robobinding.androidmvvm;

import org.robobinding.presentationmodel.AbstractPresentationModel;


/**
 *
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Cheng Wei
 */
public class PresentationModel extends AbstractPresentationModel {
    private String name;
    public String getHello() {
	return name + ": hello Android MVVM(Presentation Model)!";
    }
    
    public String getName() {
	return name;
    }
    
    public void setName(String name) {
	this.name = name;
    }
    
    public void sayHello() {
	firePropertyChange("hello");
    }
}
