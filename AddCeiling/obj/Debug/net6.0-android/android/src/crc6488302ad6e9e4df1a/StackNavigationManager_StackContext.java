package crc6488302ad6e9e4df1a;


public class StackNavigationManager_StackContext
	extends androidx.appcompat.view.ContextThemeWrapper
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Microsoft.Maui.StackNavigationManager+StackContext, Microsoft.Maui", StackNavigationManager_StackContext.class, __md_methods);
	}


	public StackNavigationManager_StackContext ()
	{
		super ();
		if (getClass () == StackNavigationManager_StackContext.class)
			mono.android.TypeManager.Activate ("Microsoft.Maui.StackNavigationManager+StackContext, Microsoft.Maui", "", this, new java.lang.Object[] {  });
	}


	public StackNavigationManager_StackContext (android.content.Context p0, android.content.res.Resources.Theme p1)
	{
		super (p0, p1);
		if (getClass () == StackNavigationManager_StackContext.class)
			mono.android.TypeManager.Activate ("Microsoft.Maui.StackNavigationManager+StackContext, Microsoft.Maui", "Android.Content.Context, Mono.Android:Android.Content.Res.Resources+Theme, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public StackNavigationManager_StackContext (android.content.Context p0, int p1)
	{
		super (p0, p1);
		if (getClass () == StackNavigationManager_StackContext.class)
			mono.android.TypeManager.Activate ("Microsoft.Maui.StackNavigationManager+StackContext, Microsoft.Maui", "Android.Content.Context, Mono.Android:System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0, p1 });
	}

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
