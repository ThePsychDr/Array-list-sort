import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//
// import any additional packages your program might need.

class TweetLoader {

	// Implement the methods associated with the TweetLoader class
	// as described in the problem_set specification.
	public static ArrayList<Tweet> loadAsArrayList(String filename) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(filename));

		ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
		String line = null;

		while ((line = reader.readLine()) != null) {
			String[] tweet_data = line.split(",");

			Tweet new_Tweet = new Tweet(Integer.parseInt(tweet_data[1]), tweet_data[0], tweet_data[2]);
			tweetList.add(new_Tweet);

		}
		return tweetList;
	}

	public static Tweet[] loadAsArray(String filename) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		String line = null;
		int file_length = 0;

		while ((line = reader.readLine()) != null) {
			file_length++;
		}

		Tweet[] tweetList = new Tweet[file_length];

		BufferedReader reader1 = new BufferedReader(new FileReader(filename));

		for (int i = 0; i < file_length; i++) {

			line = null;
			line = reader1.readLine();
			String[] tweet_data = line.split(",");
			Tweet new_Tweet = new Tweet((Integer.parseInt(tweet_data[1])), tweet_data[0], tweet_data[2]);
			tweetList[i] = new_Tweet;

		}

		return tweetList;
	}

} // end of TweetLoader class.
