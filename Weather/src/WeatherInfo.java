import java.util.List;

public class WeatherInfo {
	private List<Results> results;
	
	public void setResults(List<Results> results) {
		this.results = results;
	}
	public List<Results> getResults(){
		return this.results;
	}

}

/*
 * 
 * { "results": [ { "location": { "id": "WT9NG9P4ZDHG", "name": "信阳", "country":
 * "CN", "path": "信阳,信阳,河南,中国", "timezone": "Asia/Shanghai", "timezone_offset":
 * "+08:00" }, "daily": [ { "date": "2017-03-25", "text_day": "多云", "code_day":
 * "4", "text_night": "晴", "code_night": "0", "high": "18", "low": "7",
 * "precip": "", "wind_direction": "西北", "wind_direction_degree": "315",
 * "wind_speed": "10", "wind_scale": "2" }, { "date": "2017-03-26", "text_day":
 * "晴", "code_day": "0", "text_night": "晴", "code_night": "0", "high": "19",
 * "low": "6", "precip": "", "wind_direction": "西北", "wind_direction_degree":
 * "315", "wind_speed": "10", "wind_scale": "2" }, { "date": "2017-03-27",
 * "text_day": "晴", "code_day": "0", "text_night": "多云", "code_night": "4",
 * "high": "21", "low": "11", "precip": "", "wind_direction": "南",
 * "wind_direction_degree": "180", "wind_speed": "15", "wind_scale": "3" } ],
 * "last_update": "2017-03-25T08:00:00+08:00" } ] }
 */