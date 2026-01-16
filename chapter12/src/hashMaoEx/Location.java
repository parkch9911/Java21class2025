package hashMaoEx;

public class Location {
	private String cityName; //나라이름
	private int longitude; //경도
	private int latitude; //위도
	
	public Location() {};
	public Location(String cityName, int longitude, int latitude) {
		this.cityName = cityName;
		this.latitude = latitude;
		this.longitude = longitude;
		
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getLongitude() {
		return longitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	public int getLatitude() {
		return latitude;
	}
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	};
	
	//자바 최상위 클래스 Object 이다.
	// Object -> toString()메소드 디폴트 -> String데이터 타입으로 출력할 때 사용
	// 현재 메소드의 최상위 클래스 확인하는 방법 : Ctrl + t
	// 단 ,반드시 재정의해야한다.
	@Override
	public String toString() {
		return cityName +" "+longitude +" "+latitude;
	}
	
	
}
