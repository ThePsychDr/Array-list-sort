
//
// Implement the tweet class according to the problem_set specifications.
//
class Tweet implements Comparable {

// Define the Attributes
	private int tweetId;
	private String tweetSentiment;
	private String tweetText;

	// Define a constructor.
	public Tweet(int tweetId, String tweetSentiment, String tweetText) {
		this.tweetId = tweetId;
		this.tweetSentiment = tweetSentiment;
		this.tweetText = tweetText;
	}

	public Tweet() {
		// TODO Auto-generated constructor stub
	}

	public int getTweetId() {
		return tweetId;
	}

	public void setTweetId(int tweetId) {
		this.tweetId = tweetId;
	}

	public String getTweetSentiment() {
		return tweetSentiment;
	}

	public void setTweetSentiment(String tweetSentiment) {
		this.tweetSentiment = tweetSentiment;
	}

	public String getTweetText() {
		return tweetText;
	}

	public void setTweetText(String tweetText) {
		this.tweetText = tweetText;
	}

	// Override the toString method.
	public String toString() {
		return String.format("%d (%s): %s", this.tweetId, this.tweetSentiment, this.tweetText);
	}

	// Override .equals
	public boolean equals(Object o) {
		Tweet tmp = (Tweet) o;
		if (this.tweetId == tmp.tweetId) {
			return true;
		}
		return false;
	}

	// Override compareTo
	@Override
	public int compareTo(Object o) {
		Tweet tmp = (Tweet) o;
		if (this.tweetId < tmp.tweetId) {
			return -1;
		} else if (this.tweetId > tmp.tweetId) {
			return 1;
		}
		return 0;
	}

} // End of Tweet class
