package org.robobinding.androidmvvm;

import org.robobinding.ViewBinder;
import org.robobinding.binder.BinderFactory;
import org.robobinding.binder.BinderFactoryBuilder;
import org.robobinding.binder.Binders;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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
		ViewBinder viewBinder = createViewBinder();
		View rootView = viewBinder.inflateAndBind(R.layout.activity_main, presentationModel);
		setContentView(rootView);
    }

	private ViewBinder createViewBinder() {
		BinderFactory reusableBinderFactory = new BinderFactoryBuilder().build();
		return reusableBinderFactory.createViewBinder(this);
	}

}
