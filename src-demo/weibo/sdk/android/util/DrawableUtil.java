package weibo.sdk.android.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

import android.graphics.drawable.Drawable;
import android.util.Log;

public class DrawableUtil {
	
	public static Drawable getNetImage(URL url){
		if (url != null) {
			try {
				URLConnection urlConnection =url.openConnection();
				InputStream is =new BufferedInputStream(urlConnection.getInputStream());
				return Drawable.createFromStream(is, "image");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				Log.i("wen", "错咯没");
				e.printStackTrace();
			}
		}
		
		return null;
	}

}
