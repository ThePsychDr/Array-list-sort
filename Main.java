import java.io.IOException;
import java.util.ArrayList;

class Main extends SearchObject {

	public static void main(String[] args) {

		ArrayList<Tweet> myList = null;
		try {
			myList = TweetLoader.loadAsArrayList("tweet_data.csv");

		} catch (IOException e) {
			System.out.println(e);
		}

		Tweet[] newArray = new Tweet[100];
		try {
			newArray = TweetLoader.loadAsArray("tweet_data_sorted.csv");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Implement the main method according the the program specification

		printHead(myList, 8);
		printTail(myList, 8);
		printHead(newArray, 8);
		printTail(newArray, 8);
		System.out.println(linearSearch(newArray, newArray.length, new Tweet(1000, "", "")));
		System.out.println(linearSearch(newArray, newArray.length, new Tweet(1005, "", "")));
		System.out.println(linearSearch(newArray, newArray.length, new Tweet(1804, "", "")));
		System.out.println(linearSearch(newArray, newArray.length, new Tweet(2499, "", "")));
		System.out.println(linearSearch(newArray, newArray.length, new Tweet(2504, "", "")));
		System.out.println(linearSearch(newArray, newArray.length, new Tweet(2800, "", "")));

		System.out.println(binarySearch(newArray, newArray.length, new Tweet(1000, "", "")));
		System.out.println(binarySearch(newArray, newArray.length, new Tweet(1005, "", "")));
		System.out.println(binarySearch(newArray, newArray.length, new Tweet(1804, "", "")));
		System.out.println(binarySearch(newArray, newArray.length, new Tweet(2499, "", "")));
		System.out.println(binarySearch(newArray, newArray.length, new Tweet(2504, "", "")));
		System.out.println(binarySearch(newArray, newArray.length, new Tweet(2800, "", "")));

		Tweet a = new Tweet(10, "pos", "hello");
		Student b = new Student("Trevin", "Bachan", 99);
		Node<Tweet> anode = new Node<Tweet>(a, null);
		Node<Student> bnode = new Node<Student>(b, null);

	}

	public static void printHead(ArrayList<Tweet> list, int n) {

		for (int i = 0; i < n; i++) {
			System.out.println(list.get(i));
		}
	}

	public static void printHead(Tweet[] list, int n) {

		for (int i = 0; i < n; i++) {
			System.out.println(list[i]);

		}
	}

	public static void printTail(ArrayList<Tweet> list, int n) {
		int s = list.size();
		for (int i = s - n; i < s; i++) {

			System.out.println(list.get(i));

		}
	}

	public static void printTail(Tweet[] list, int n) {
		int s = list.length;
		for (int i = s - n; i < s; i++) {

			System.out.println(list[i]);
		}
	}

} // end of Main class
