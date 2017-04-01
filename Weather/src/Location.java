import com.google.gson.annotations.SerializedName;

public class Location {
	private String id;
	private String name;
	private String country;
	private String path;
	private String timezone;
	@SerializedName("timezone_offset")
	private String timezoneOffset;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return this.country;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPath() {
		return this.path;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getTimezone() {
		return this.timezone;
	}

	public void setTimezoneOffset(String timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
	}

	public String getTimezoneOffset() {
		return this.timezoneOffset;
	}
	
	public String toString() {
		return name;
	}
}
