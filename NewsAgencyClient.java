import java.util.*;

public class NewsAgencyClient {
	
	    public static void main(String[] args){

	        Subscriber cinderella = new Subscriber();
	        cinderella.setSubscriberName("Cinderella");
	        cinderella.setCategory("General");

	        Subscriber rapunzel = new Subscriber();
	        rapunzel.setSubscriberName("Rapunzel");
	        rapunzel.setCategory("General");

	        Subscriber mulan = new Subscriber();
	        mulan.setSubscriberName("Mulan");
	        mulan.setCategory("General");
	        
	        Subscriber olaf = new Subscriber();
	        olaf.setSubscriberName("Olaf");
	        olaf.setCategory("General");

	        List<Subscriber> SubscriberList = new ArrayList<>();
	        
	        SubscriberList.add(cinderella);
	        SubscriberList.add(rapunzel);
	        SubscriberList.add(mulan);

	        NewsAgency newsAgency = new NewsAgency();
	        newsAgency.setNews("Kennedy Is Killed By Sniper As He Rides In Car In Dallas.\n");
	        newsAgency.setNewsCategory("General");
	        newsAgency.setSubscriberList(SubscriberList);

	        System.out.println("NewsAgency: Publishing News - " + newsAgency.getNews());
	        newsAgency.notifySubscribers();

	        newsAgency.detach(rapunzel);
	        System.out.println("\nRapunzel unsubscribed.");

	        olaf.setCategory("Sports");
	        newsAgency.attach(olaf);
	        System.out.println("\nOlaf subscribed to news agency.");
	        System.out.println("Olaf subscribed to Sports news.");

	        newsAgency.setNews("Titanic Sinks Four Hours After Hitting Iceberg!\n");
	        newsAgency.setNewsCategory("General");

	        System.out.println("\nNewsAgency: Publishing News - " + newsAgency.getNews());
	        newsAgency.notifySubscribers();

	        newsAgency.setNews("The home team wins the championship!");
	        newsAgency.setNewsCategory("Sports");
	        newsAgency.notifySubscribers();
	    }
	}