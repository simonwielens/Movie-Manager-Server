package ie.simo.moviemanager.gae.domain;

public class MovieDetails {

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MovieDetails [name=");
		builder.append(name);
		builder.append(", productionCompanyName=");
		builder.append(productionCompanyName);
		builder.append(", boxOfficeResult=");
		builder.append(boxOfficeResult);
		builder.append("]");
		return builder.toString();
	}
	private String name;
	private String productionCompanyName;
	private int boxOfficeResult;
	
	public MovieDetails(String name, String compName, int cash){
		this.name = name;
		this.productionCompanyName = compName;
		this.boxOfficeResult = cash;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductionCompanyName() {
		return productionCompanyName;
	}
	public void setProductionCompanyName(String productionCompanyName) {
		this.productionCompanyName = productionCompanyName;
	}
	public int getBoxOfficeResult() {
		return boxOfficeResult;
	}
	public void setBoxOfficeResult(int boxOfficeResult) {
		this.boxOfficeResult = boxOfficeResult;
	}
}
