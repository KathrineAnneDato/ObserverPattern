import java.util.List;

public class NewsAgency implements NewsAgencySubject{
	
	    private String news;
	    private String newsCategory;
	    private List<Subscriber> subscriberList;

	    public String getNews() {
	        return news;
	    }

	    public void setNews(String news) {
	        this.news = news;
	    }

	    public String getNewsCategory() {
	        return newsCategory;
	    }

	    public void setNewsCategory(String newsCategory) {
	        this.newsCategory = newsCategory;
	    }

	    public List<Subscriber> getSubscriberList() {
	        return subscriberList;
	    }

	    public void setSubscriberList(List<Subscriber> subscriberList) {
	        this.subscriberList = subscriberList;
	    }
	    
	    @Override
	    public void attach(Subscriber subscriber) {
	        subscriberList.add(subscriber);
	    }

	    @Override
	    public void detach(Subscriber subscriber) {
	        subscriberList.remove(subscriber);
	    }
	    
	    
	    @Override
	    public String notifySubscribers() {
	        String output = "";  // Initialize an empty string to collect notifications

	        for (Subscriber subscriber : subscriberList) {
	            // Create an instance of publishedNews with the appropriate news content
	            publishedNews newsContent = new publishedNews(news, newsCategory);

	            // Check if the subscriber's category matches the news category
	            if (subscriber.getCategory().equals(newsCategory)) {
	                subscriber.updateNews(newsContent);
	                output += "Hello, " + subscriber.getSubscriberName() + "!\n";
	                output += "Breaking News: " + newsContent.getNewsContent() + "\n\n";  // Call the instance method here
	            } else if (!newsCategory.equals("Sports")) {
	                // Notify the subscriber with general news if not "Sports"
	                subscriber.updateNews(newsContent);
	                output += "Hello, " + subscriber.getSubscriberName() + "!\n";
	                output += "\nBreaking News: " + newsContent.getNewsContent() + "\n\n";  // Call the instance method here
	            }
	        }
	        
	        return output;  // Return the collected notification string
	    }
}