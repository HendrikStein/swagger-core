package converter.models;

import com.google.gson.annotations.SerializedName;

public class ModelWithGsonProperty {
	@SerializedName("The-Count")
	private Integer count;

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getCount() {
		return count;
	}
}
