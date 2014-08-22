package org.robobinding.androidmvvm;

import org.robobinding.binder.Binders;
import org.robobinding.hellomvvm.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
/**
*
* @since 1.0
* @version $Revision: 1.0 $
* @author Cheng Wei
*/
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	
	PresentationModel presentationModel = new PresentationModel();
	View rootView = Binders.inflateAndBindWithoutPreInitializingViews(this, R.layout.activity_main, presentationModel);
	setContentView(rootView);
    }

}
