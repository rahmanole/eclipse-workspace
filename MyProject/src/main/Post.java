package main;

import java.util.Date;
import java.util.List;


public class Post {
    private int id;
    private String cat;
    private String subCat;
    private Date dateTime;
    private String url;
    private String heading;
    private String ftrImg;
    private List<Para> postBody;
    private String publisher;
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getFtrImg() {
        return ftrImg;
    }

    public void setFtrImg(String ftrImg) {
        this.ftrImg = ftrImg;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public List<Para> getPostBody() {
        return postBody;
    }

    public void setPostBody(List<Para> postBody) {
        this.postBody = postBody;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

	public String getSubCat() {
		return subCat;
	}

	public void setSubCat(String subCat) {
		this.subCat = subCat;
	}

    
}
