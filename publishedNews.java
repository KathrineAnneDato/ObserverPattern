public class publishedNews {

	    private String news;
	    private String newsCategory;

	    public publishedNews(String news, String newsCategory) {
	        this.news = news;
	        this.newsCategory = newsCategory;
	    }

	    public String getNewsContent() {
	        return news + (newsCategory.equals("Sports") ? " [Sports]" : "");
	    }
	}

