package Quiz_App;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service {
	
	List<Questions> questions = new ArrayList<> () ;
	
	public Service () {
		questions.add(new Questions("What is the capital of France?",
		        new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 2));
		questions.add(new Questions("What is the largest ocean on Earth?",
		        new String[]{"Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"}, 3));
		questions.add(new Questions("What is the chemical symbol for gold?",
		        new String[]{"Au", "Ag", "Fe", "Pb"}, 0));
		questions.add(new Questions("Who wrote 'To Kill a Mockingbird'?",
		        new String[]{"Harper Lee", "Mark Twain", "Ernest Hemingway", "F. Scott Fitzgerald"}, 0));
		questions.add(new Questions("What is the smallest planet in our solar system?",
		        new String[]{"Earth", "Mars", "Mercury", "Venus"}, 2));
		questions.add(new Questions("What is the powerhouse of the cell?",
		        new String[]{"Nucleus", "Mitochondria", "Ribosome", "Cytoplasm"}, 1));
		questions.add(new Questions("Which country is known as the Land of the Rising Sun?",
		        new String[]{"China", "Japan", "South Korea", "Thailand"}, 1));
		questions.add(new Questions("What is the longest river in the world?",
		        new String[]{"Amazon River", "Nile River", "Mississippi River", "Yangtze River"}, 1));
		questions.add(new Questions("What is the capital of Australia?",
		        new String[]{"Sydney", "Melbourne", "Canberra", "Brisbane"}, 2));
		questions.add(new Questions("In which year did the Titanic sink?",
		        new String[]{"1910", "1912", "1914", "1916"}, 1));
		questions.add(new Questions("What is the square root of 64?",
		        new String[]{"6", "7", "8", "9"}, 2));
		questions.add(new Questions("Who painted the Mona Lisa?",
		        new String[]{"Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Claude Monet"}, 2));
		questions.add(new Questions("What is the capital of Brazil?",
		        new String[]{"Rio de Janeiro", "São Paulo", "Brasília", "Buenos Aires"}, 2));
		questions.add(new Questions("What is the currency of Japan?",
		        new String[]{"Yuan", "Won", "Yen", "Dollar"}, 2));
		questions.add(new Questions("Which gas do plants absorb from the atmosphere?",
		        new String[]{"Oxygen", "Nitrogen", "Carbon Dioxide", "Hydrogen"}, 2));
		questions.add(new Questions("Who was the first man to walk on the moon?",
		        new String[]{"Buzz Aldrin", "Yuri Gagarin", "Neil Armstrong", "Michael Collins"}, 2));
		questions.add(new Questions("What is the capital of Canada?",
		        new String[]{"Toronto", "Vancouver", "Ottawa", "Montreal"}, 2));
		questions.add(new Questions("What is the largest desert in the world?",
		        new String[]{"Sahara Desert", "Arabian Desert", "Gobi Desert", "Antarctic Polar Desert"}, 3));
		questions.add(new Questions("What is the chemical symbol for water?",
		        new String[]{"H2O", "CO2", "O2", "NaCl"}, 0));
		questions.add(new Questions("How many continents are there on Earth?",
		        new String[]{"5", "6", "7", "8"}, 2));
		questions.add(new Questions("Which is the largest bone in the human body?",
		        new String[]{"Tibia", "Femur", "Humerus", "Patella"}, 1));
		questions.add(new Questions("What is the capital of Egypt?",
		        new String[]{"Alexandria", "Cairo", "Luxor", "Giza"}, 1));
		questions.add(new Questions("What is the main ingredient of guacamole?",
		        new String[]{"Tomato", "Onion", "Avocado", "Lime"}, 2));
		questions.add(new Questions("Who invented the telephone?",
		        new String[]{"Thomas Edison", "Alexander Graham Bell", "Nikola Tesla", "Albert Einstein"}, 1));
		questions.add(new Questions("What is the largest country in the world by land area?",
		        new String[]{"China", "Canada", "USA", "Russia"}, 3));
		questions.add(new Questions("What is the capital of Germany?",
		        new String[]{"Frankfurt", "Munich", "Berlin", "Hamburg"}, 2));
		questions.add(new Questions("What is the hottest planet in our solar system?",
		        new String[]{"Mars", "Venus", "Mercury", "Jupiter"}, 1));
		questions.add(new Questions("What is the currency of the United Kingdom?",
		        new String[]{"Euro", "Dollar", "Pound Sterling", "Franc"}, 2));
		questions.add(new Questions("Which famous scientist developed the theory of relativity?",
		        new String[]{"Isaac Newton", "Galileo Galilei", "Albert Einstein", "Stephen Hawking"}, 2));
		questions.add(new Questions("What is the capital of Spain?",
		        new String[]{"Barcelona", "Madrid", "Lisbon", "Seville"}, 1));
		questions.add(new Questions("What is the name of the largest ocean?",
		        new String[]{"Atlantic", "Indian", "Pacific", "Arctic"}, 2));
		questions.add(new Questions("What is the capital of Italy?",
		        new String[]{"Milan", "Venice", "Rome", "Florence"}, 2));
		questions.add(new Questions("What is the chemical symbol for iron?",
		        new String[]{"Au", "Fe", "Ag", "Pb"}, 1));
		questions.add(new Questions("Who wrote '1984'?",
		        new String[]{"George Orwell", "Aldous Huxley", "J.R.R. Tolkien", "Ray Bradbury"}, 0));
		questions.add(new Questions("What is the capital of China?",
		        new String[]{"Shanghai", "Beijing", "Hong Kong", "Guangzhou"}, 1));
		questions.add(new Questions("What is the capital of Russia?",
		        new String[]{"St. Petersburg", "Moscow", "Kyiv", "Novosibirsk"}, 1));
		questions.add(new Questions("What is the capital of Mexico?",
		        new String[]{"Cancún", "Guadalajara", "Mexico City", "Monterrey"}, 2));
		questions.add(new Questions("What is the main language spoken in Brazil?",
		        new String[]{"Spanish", "Portuguese", "English", "French"}, 1));
		questions.add(new Questions("What is the largest volcano in the solar system?",
		        new String[]{"Mount Fuji", "Mauna Loa", "Olympus Mons", "Mount Vesuvius"}, 2));
		questions.add(new Questions("What is the capital of Argentina?",
		        new String[]{"Buenos Aires", "Córdoba", "Rosario", "Mendoza"}, 0));
		questions.add(new Questions("Who is the author of 'The Lord of the Rings'?",
		        new String[]{"C.S. Lewis", "J.K. Rowling", "George R.R. Martin", "J.R.R. Tolkien"}, 3));
		questions.add(new Questions("What is the capital of South Korea?",
		        new String[]{"Busan", "Seoul", "Incheon", "Daegu"}, 1));
		questions.add(new Questions("What is the chemical symbol for oxygen?",
		        new String[]{"O", "Ox", "O2", "Oxy"}, 2));
		questions.add(new Questions("What is the capital of South Africa?",
		        new String[]{"Johannesburg", "Pretoria", "Cape Town", "Durban"}, 1));
		questions.add(new Questions("What is the largest moon of Saturn?",
		        new String[]{"Titan", "Enceladus", "Rhea", "Mimas"}, 0));
		questions.add(new Questions("What is the capital of Greece?",
		        new String[]{"Thessaloniki", "Athens", "Heraklion", "Patras"}, 1));
		questions.add(new Questions("What is the national animal of Australia?",
		        new String[]{"Kangaroo", "Koala", "Emu", "Wombat"}, 0));
		questions.add(new Questions("What is the capital of Sweden?",
		        new String[]{"Gothenburg", "Malmö", "Stockholm", "Uppsala"}, 2));
		questions.add(new Questions("What is the capital of Switzerland?",
		        new String[]{"Geneva", "Zurich", "Bern", "Lausanne"}, 2));
		questions.add(new Questions("Which country is famous for the pyramids?",
		        new String[]{"Greece", "Italy", "Egypt", "Mexico"}, 2));
		questions.add(new Questions("What is the capital of Portugal?",
		        new String[]{"Porto", "Lisbon", "Faro", "Coimbra"}, 1));
		questions.add(new Questions("What is the currency of China?",
		        new String[]{"Yen", "Won", "Yuan", "Dollar"}, 2));
		questions.add(new Questions("What is the capital of New Zealand?",
		        new String[]{"Auckland", "Christchurch", "Wellington", "Queenstown"}, 2));
		questions.add(new Questions("Who discovered penicillin?",
		        new String[]{"Marie Curie", "Louis Pasteur", "Alexander Fleming", "Jonas Salk"}, 2));
		questions.add(new Questions("What is the capital of Ireland?",
		        new String[]{"Cork", "Dublin", "Galway", "Limerick"}, 1));
		questions.add(new Questions("What is the smallest country in the world?",
		        new String[]{"Monaco", "Nauru", "Vatican City", "San Marino"}, 2));
		questions.add(new Questions("What is the capital of Norway?",
		        new String[]{"Bergen", "Oslo", "Stavanger", "Trondheim"}, 1));
		questions.add(new Questions("What is the chemical symbol for silver?",
		        new String[]{"Ag", "Au", "Fe", "Pb"}, 0));
		questions.add(new Questions("What is the capital of Finland?",
		        new String[]{"Tampere", "Helsinki", "Turku", "Oulu"}, 1));
		questions.add(new Questions("What is the main component of Earth's atmosphere?",
		        new String[]{"Oxygen", "Carbon Dioxide", "Nitrogen", "Argon"}, 2));
		questions.add(new Questions("What is the capital of Poland?",
		        new String[]{"Kraków", "Warsaw", "Wrocław", "Łódź"}, 1));
		questions.add(new Questions("What is the capital of Hungary?",
		        new String[]{"Debrecen", "Budapest", "Szeged", "Pécs"}, 1));
		questions.add(new Questions("What is the currency of India?",
		        new String[]{"Yen", "Dollar", "Rupee", "Euro"}, 2));
		questions.add(new Questions("What is the capital of Austria?",
		        new String[]{"Salzburg", "Vienna", "Innsbruck", "Graz"}, 1));
		questions.add(new Questions("Who was the first President of the United States?",
		        new String[]{"Abraham Lincoln", "Thomas Jefferson", "George Washington", "John Adams"}, 2));
		questions.add(new Questions("What is the capital of Denmark?",
		        new String[]{"Aarhus", "Copenhagen", "Odense", "Aalborg"}, 1));
		questions.add(new Questions("What is the capital of Belgium?",
		        new String[]{"Antwerp", "Bruges", "Brussels", "Ghent"}, 2));
		questions.add(new Questions("What is the capital of Netherlands?",
		        new String[]{"Rotterdam", "Amsterdam", "The Hague", "Utrecht"}, 1));
		questions.add(new Questions("What is the capital of United Arab Emirates?",
		        new String[]{"Dubai", "Abu Dhabi", "Sharjah", "Ajman"}, 1));
		questions.add(new Questions("What is the capital of Egypt?",
		        new String[]{"Alexandria", "Cairo", "Luxor", "Giza"}, 1));
		questions.add(new Questions("What is the chemical symbol for sodium?",
		        new String[]{"Na", "So", "N", "S"}, 0));
		questions.add(new Questions("What is the capital of Saudi Arabia?",
		        new String[]{"Mecca", "Medina", "Riyadh", "Jeddah"}, 2));
		questions.add(new Questions("What is the capital of Turkey?",
		        new String[]{"Istanbul", "Ankara", "Izmir", "Antalya"}, 1));
		questions.add(new Questions("What is the capital of Singapore?",
		        new String[]{"Kuala Lumpur", "Bangkok", "Singapore City", "Jakarta"}, 2));
		questions.add(new Questions("What is the largest country in South America?",
		        new String[]{"Argentina", "Brazil", "Chile", "Peru"}, 1));
		questions.add(new Questions("What is the capital of Vietnam?",
		        new String[]{"Ho Chi Minh City", "Hanoi", "Da Nang", "Hue"}, 1));
		questions.add(new Questions("What is the capital of Thailand?",
		        new String[]{"Chiang Mai", "Phuket", "Bangkok", "Pattaya"}, 2));
		questions.add(new Questions("What is the capital of Malaysia?",
		        new String[]{"Penang", "Kuala Lumpur", "Johor Bahru", "Malacca City"}, 1));
		questions.add(new Questions("What is the capital of Indonesia?",
		        new String[]{"Bali", "Jakarta", "Surabaya", "Medan"}, 1));
		questions.add(new Questions("What is the capital of Philippines?",
		        new String[]{"Cebu", "Manila", "Davao", "Baguio"}, 1));
		questions.add(new Questions("What is the capital of Ukraine?",
		        new String[]{"Lviv", "Odesa", "Kyiv", "Kharkiv"}, 2));
		questions.add(new Questions("What is the capital of Pakistan?",
		        new String[]{"Karachi", "Lahore", "Islamabad", "Faisalabad"}, 2));
		questions.add(new Questions("What is the capital of Iran?",
		        new String[]{"Isfahan", "Tehran", "Shiraz", "Mashhad"}, 1));
		questions.add(new Questions("What is the capital of Iraq?",
		        new String[]{"Basra", "Baghdad", "Mosul", "Erbil"}, 1));
		questions.add(new Questions("What is the capital of Afghanistan?",
		        new String[]{"Herat", "Kandahar", "Kabul", "Mazar-i-Sharif"}, 2));
		questions.add(new Questions("What is the capital of Israel?",
		        new String[]{"Tel Aviv", "Haifa", "Jerusalem", "Eilat"}, 2));
		questions.add(new Questions("What is the capital of Jordan?",
		        new String[]{"Petra", "Amman", "Aqaba", "Jerash"}, 1));
		questions.add(new Questions("What is the capital of Syria?",
		        new String[]{"Aleppo", "Damascus", "Homs", "Latakia"}, 1));
		questions.add(new Questions("What is the capital of Lebanon?",
		        new String[]{"Byblos", "Tripoli", "Beirut", "Tyre"}, 2));
		questions.add(new Questions("What is the capital of Kuwait?",
		        new String[]{"Al Jahra", "Hawalli", "Kuwait City", "Salmiya"}, 2));
		questions.add(new Questions("What is the capital of Bahrain?",
		        new String[]{"Riffa", "Manama", "Muharraq", "Hamad Town"}, 1));
		questions.add(new Questions("What is the capital of Qatar?",
		        new String[]{"Al Khor", "Al Wakrah", "Doha", "Al Rayyan"}, 2));
		questions.add(new Questions("What is the capital of Oman?",
		        new String[]{"Salalah", "Muscat", "Sohar", "Nizwa"}, 1));
		questions.add(new Questions("What is the capital of Yemen?",
		        new String[]{"Taiz", "Sanaa", "Aden", "Hodeidah"}, 1));
		questions.add(new Questions("What is the capital of Bangladesh?",
		        new String[]{"Chittagong", "Dhaka", "Khulna", "Sylhet"}, 1));
		questions.add(new Questions("What is the capital of Sri Lanka?",
		        new String[]{"Kandy", "Colombo", "Galle", "Jaffna"}, 1));
		questions.add(new Questions("What is the capital of Nepal?",
		        new String[]{"Pokhara", "Kathmandu", "Lalitpur", "Bhaktapur"}, 1));
		questions.add(new Questions("What is the capital of Bhutan?",
		        new String[]{"Paro", "Thimphu", "Punakha", "Phuentsholing"}, 1));
		questions.add(new Questions("What is the capital of Maldives?",
		        new String[]{"Addu Atoll", "Male", "Fuvahmulah", "Kulhudhuffushi"}, 1));
		questions.add(new Questions("What is the capital of Myanmar (Burma)?",
		        new String[]{"Yangon", "Mandalay", "Naypyidaw", "Bagan"}, 2));
		questions.add(new Questions("What is the capital of Cambodia?",
		        new String[]{"Siem Reap", "Phnom Penh", "Battambang", "Sihanoukville"}, 1));
		questions.add(new Questions("What is the capital of Laos?",
		        new String[]{"Luang Prabang", "Pakse", "Vientiane", "Savannakhet"}, 2));
		questions.add(new Questions("What is the capital of Timor-Leste?",
		        new String[]{"Dili", "Baucau", "Maliana", "Suai"}, 0));
		questions.add(new Questions("What is the capital of Brunei?",
		        new String[]{"Kuala Belait", "Seria", "Bandar Seri Begawan", "Tutong"}, 2));

}

	public List<Questions> getQ() {
		Collections.shuffle(questions) ;
		return questions.subList(0, 10) ;
	}

}