import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Results {
	private Location location;
	private List<Daily> daily;
	@SerializedName("lastUpdate")
	private String lastUpdate;

	public void setLocation(Location location) {
		this.location = location;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setDaily(List<Daily> daily) {
		this.daily = daily;
	}

	public List<Daily> getDaily() {
		return this.daily;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getLastUpdate() {
		return this.lastUpdate;
	}
}
