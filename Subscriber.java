public class Subscriber implements SubscriberObserver{
	 
		private String subscriberName;
	    private String category;


	    public String getSubscriberName() {
	        return subscriberName;
	    }

	    public void setSubscriberName(String subscriberName) {
	        this.subscriberName = subscriberName;
	    }
	    
	    public String getCategory() {
	        return category;
	    }

	    public void setCategory(String category) {
	        this.category = category;
	    }

	    @Override
	    public void updateNews(publishedNews PublishedNews) {
	        System.out.println("Hello, " + subscriberName + "! Breaking News: " + PublishedNews.getNewsContent());
	    }
	}
