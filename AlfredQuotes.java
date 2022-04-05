import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello," + name +". Lovely to see you!";
    }
    
    public String dateAnnouncement() {
        Date now = new Date();
        return "It is currently " + now ;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // int a = conversation.indexOf("Alexis");
        // return "Right away, miss. She certainly isn't sophisticated enough for that.";
        
        int b = conversation.indexOf("Alfred");
        return "At your service. As you wish, naturally.";
        
        
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

