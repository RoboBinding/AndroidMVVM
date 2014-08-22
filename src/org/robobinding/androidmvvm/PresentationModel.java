package org.robobinding.androidmvvm;


/**
 *
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Cheng Wei
 */
@org.robobinding.aspects.PresentationModel
public class PresentationModel {
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
