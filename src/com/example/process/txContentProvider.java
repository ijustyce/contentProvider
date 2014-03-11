package com.example.process;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.util.Log;

public class txContentProvider extends ContentProvider{
	
	@Override
	public int delete(Uri arg0, String arg1, String[] arg2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getType(Uri arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Uri insert(Uri arg0, ContentValues arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean onCreate() {
		
		Log.i("---justyce---", "content provider created ");
	
		Log.i("---caller---", getCallingPackages());
		Intent intent = new Intent(this.getContext() , auth.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		this.getContext().startActivity(intent);
		// TODO Auto-generated method stub
		return false;
	}
	
	private String getCallingPackages() {
	     int caller = Binder.getCallingUid();
	     Log.i("---uid---", "" + caller);
	     if (caller == 0) {
	         return null;
	     }
	     return this.getContext().getPackageManager().
	    		 getPackagesForUid(caller)[0];
	 }

	@Override
	public Cursor query(Uri arg0, String[] arg1, String arg2, String[] arg3,
			String arg4) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Uri arg0, ContentValues arg1, String arg2, String[] arg3) {
		// TODO Auto-generated method stub
		return 0;
	}

}
