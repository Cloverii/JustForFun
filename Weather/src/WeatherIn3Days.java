import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.List;
import com.google.gson.Gson;

public class WeatherIn3Days {
	
	private static String getInfo(String key, String location) {
		String weatherUrl = "https://api.seniverse.com/v3/weather/daily.json?key=" + key + 
				"&location=" + location + "&language=zh-Hans&unit=c&start=0&days=5";
		//System.out.println(weatherUrl);

		StringBuffer strBuf = new StringBuffer();

		try {
			URL url = new URL(weatherUrl);
			URLConnection connection = url.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line = null;
			while((line = reader.readLine()) != null)
				strBuf.append(line + " ");
			reader.close();
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return strBuf.toString();
	}
	
	private static WeatherInfo convertJSON2Object(String weather) {
		return new Gson().fromJson(weather, WeatherInfo.class);
	}
	

	public static void main(String args[]) {
		String myKey = "zacppayxppobkyjr";
		String myLocation = "ip"; // some IPs may be invalid
		
		String strWeather = getInfo(myKey, myLocation);

		WeatherInfo weatherInfo = convertJSON2Object(strWeather);
		
		Results result = weatherInfo.getResults().get(0);
		Location location = result.getLocation();
		System.out.println(location.toString());
		List<Daily> daily = result.getDaily();
		for(Daily curDay: daily) {
			System.out.println(curDay);
		}
	}
}
