package entity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class TickerMasterObject {
	
	private String id;
	private String name;
	private String url;
	private double distance;
	private List<Image> images;
	private List<Classification> classifications;
	private Embedded _embedded;

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public double getDistance() {
		return distance;
	}

	public List<Image> getImages() {
		return images;
	}

	public List<Classification> getClassifications() {
		return classifications;
	}

	public Embedded get_embedded() {
		return _embedded;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
