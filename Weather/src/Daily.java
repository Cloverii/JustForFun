import com.google.gson.annotations.SerializedName;

public class Daily {
	private String date;
	@SerializedName("text_day")
	private String textDay;
	@SerializedName("code_day")
	private String codeDay;
	@SerializedName("text_night")
	private String textNight;
	@SerializedName("code_night")
	private String codeNight;
	private String high;
	private String low;
	private String precip;
	@SerializedName("wind_direction")
	private String windDirection;
	@SerializedName("wind_direction_degree")
	private String windDirectionDegree;
	@SerializedName("wind_speed")
	private String windSpeed;
	@SerializedName("wind_scale")
	private String windScale;

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return this.date;
	}

	public void setTextDay(String textDay) {
		this.textDay = textDay;
	}

	public String getTextDay() {
		return this.textDay;
	}

	public void setCodeDay(String codeDay) {
		this.codeDay = codeDay;
	}

	public String getCodeDay() {
		return this.codeDay;
	}

	public void setTextNight(String textNight) {
		this.textNight = textNight;
	}

	public String getTextNight() {
		return this.textNight;
	}

	public void setCodeNight(String codeNight) {
		this.codeNight = codeNight;
	}

	public String getCodeNight() {
		return this.codeNight;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getHigh() {
		return this.high;
	}

	public void setLow(String low) {
		this.low = low;
	}

	public String getLow() {
		return this.low;
	}

	public void setPrecip(String precip) {
		this.precip = precip;
	}

	public String getPrecip() {
		return this.precip;
	}

	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}

	public String getWindDirection() {
		return this.windDirection;
	}

	public void setWindDirectionDegree(String windDirectionDegree) {
		this.windDirectionDegree = windDirectionDegree;
	}

	public String getWindDirectionDegree() {
		return this.windDirectionDegree;
	}

	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}

	public String getWindSpeed() {
		return this.windSpeed;
	}

	public void setWindScale(String windScale) {
		this.windScale = windScale;
	}

	public String getWindScale() {
		return this.windScale;
	}
	
	public String toString() {
		return date + " 白天: " + textDay + "  夜晚: " + textNight + " " + low + "~" + high + "摄氏度 " + windDirection;
	}
}
