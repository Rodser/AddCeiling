package crc6488302ad6e9e4df1a;


public class StackNavigationManager_Callbacks
	extends androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
	implements
		mono.android.IGCUserPeer,
		androidx.navigation.NavController.OnDestinationChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFragmentResumed:(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V:GetOnFragmentResumed_Landroidx_fragment_app_FragmentManager_Landroidx_fragment_app_Fragment_Handler\n" +
			"n_onFragmentAttached:(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/content/Context;)V:GetOnFragmentAttached_Landroidx_fragment_app_FragmentManager_Landroidx_fragment_app_Fragment_Landroid_content_Context_Handler\n" +
			"n_onFragmentViewDestroyed:(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V:GetOnFragmentViewDestroyed_Landroidx_fragment_app_FragmentManager_Landroidx_fragment_app_Fragment_Handler\n" +
			"n_onFragmentCreated:(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V:GetOnFragmentCreated_Landroidx_fragment_app_FragmentManager_Landroidx_fragment_app_Fragment_Landroid_os_Bundle_Handler\n" +
			"n_onDestinationChanged:(Landroidx/navigation/NavController;Landroidx/navigation/NavDestination;Landroid/os/Bundle;)V:GetOnDestinationChanged_Landroidx_navigation_NavController_Landroidx_navigation_NavDestination_Landroid_os_Bundle_Handler:AndroidX.Navigation.NavController/IOnDestinationChangedListenerInvoker, Xamarin.AndroidX.Navigation.Runtime\n" +
			"";
		mono.android.Runtime.register ("Microsoft.Maui.StackNavigationManager+Callbacks, Microsoft.Maui", StackNavigationManager_Callbacks.class, __md_methods);
	}


	public StackNavigationManager_Callbacks ()
	{
		super ();
		if (getClass () == StackNavigationManager_Callbacks.class)
			mono.android.TypeManager.Activate ("Microsoft.Maui.StackNavigationManager+Callbacks, Microsoft.Maui", "", this, new java.lang.Object[] {  });
	}


	public void onFragmentResumed (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1)
	{
		n_onFragmentResumed (p0, p1);
	}

	private native void n_onFragmentResumed (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1);


	public void onFragmentAttached (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1, android.content.Context p2)
	{
		n_onFragmentAttached (p0, p1, p2);
	}

	private native void n_onFragmentAttached (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1, android.content.Context p2);


	public void onFragmentViewDestroyed (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1)
	{
		n_onFragmentViewDestroyed (p0, p1);
	}

	private native void n_onFragmentViewDestroyed (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1);


	public void onFragmentCreated (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1, android.os.Bundle p2)
	{
		n_onFragmentCreated (p0, p1, p2);
	}

	private native void n_onFragmentCreated (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1, android.os.Bundle p2);


	public void onDestinationChanged (androidx.navigation.NavController p0, androidx.navigation.NavDestination p1, android.os.Bundle p2)
	{
		n_onDestinationChanged (p0, p1, p2);
	}

	private native void n_onDestinationChanged (androidx.navigation.NavController p0, androidx.navigation.NavDestination p1, android.os.Bundle p2);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
