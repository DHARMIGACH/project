CREATE TABLE state_info (
    state_id INT ,
    state_name VARCHAR(50),
    population INT,
    area FLOAT,
    capital VARCHAR(50),
    governor VARCHAR(50),
    chief_minister VARCHAR(50),
    literacy_rate FLOAT,
    official_language VARCHAR(50),
    gdp FLOAT
);


ALTER TABLE state_info ADD COLUMN established_year INT;
ALTER TABLE state_info ADD COLUMN region VARCHAR(50);
ALTER TABLE state_info ADD COLUMN climate VARCHAR(50);
ALTER TABLE state_info ADD COLUMN famous_for VARCHAR(100);
ALTER TABLE state_info ADD COLUMN tourist_attractions VARCHAR(100);



ALTER TABLE state_info
RENAME COLUMN area TO total_area,
RENAME COLUMN capital TO state_capital,
RENAME COLUMN gdp TO gdp_per_capita,
RENAME COLUMN official_language TO primary_language,
RENAME COLUMN population TO total_population;

ALTER TABLE state_info MODIFY COLUMN total_area DOUBLE PRECISION;
ALTER TABLE state_info MODIFY COLUMN famous_for VARCHAR(255);
ALTER TABLE state_info MODIFY COLUMN tourist_attractions VARCHAR(255);
ALTER TABLE state_info MODIFY COLUMN total_population BIGINT;
ALTER TABLE state_info MODIFY COLUMN literacy_rate DECIMAL(5,2);


INSERT INTO state_info (state_id, state_name, total_population, total_area, state_capital, governor, chief_minister, literacy_rate, primary_language, gdp_per_capita, established_year, region, climate, famous_for, tourist_attractions) VALUES 
(1, 'Karnataka', 61095297, 191791, 'Bangalore', 'Thawar Chand Gehlot', 'Basavaraj Bommai', 75.36, 'Kannada', 22237, 1956, 'South', 'Tropical', 'Silicon Valley of India', 'Mysore Palace, Coorg, Hampi'),
(2, 'Tamil Nadu', 72147030, 130058, 'Chennai', 'R. N. Ravi', 'M. K. Stalin', 80.33, 'Tamil', 27890, 1950, 'South', 'Tropical', 'Dravidian Culture', 'Mahabalipuram, Ooty, Kanyakumari'),
(3, 'Maharashtra', 112374333, 307713, 'Mumbai', 'Bhagat Singh Koshyari', 'Uddhav Thackeray', 82.34, 'Marathi', 31000, 1960, 'West', 'Tropical', 'Bollywood', 'Ajanta and Ellora Caves, Gateway of India'),
(4, 'Gujarat', 60439692, 196024, 'Gandhinagar', 'Acharya Devvrat', 'Bhupendra Patel', 78.03, 'Gujarati', 24000, 1960, 'West', 'Arid', 'Business Hub', 'Statue of Unity, Gir National Park'),
(5, 'Rajasthan', 68548437, 342239, 'Jaipur', 'Kalraj Mishra', 'Ashok Gehlot', 66.11, 'Hindi', 22000, 1956, 'North', 'Arid', 'Palaces and Forts', 'Thar Desert, Udaipur, Jaisalmer Fort'),
(6, 'Kerala', 33406061, 38852, 'Thiruvananthapuram', 'Arif Mohammad Khan', 'Pinarayi Vijayan', 94.00, 'Malayalam', 29000, 1956, 'South', 'Tropical', 'Backwaters', 'Alleppey, Munnar, Wayanad'),
(7, 'Uttar Pradesh', 199812341, 243286, 'Lucknow', 'Anandiben Patel', 'Yogi Adityanath', 67.68, 'Hindi', 18000, 1950, 'North', 'Varied', 'Taj Mahal', 'Agra, Varanasi, Lucknow'),
(8, 'West Bengal', 91276115, 88752, 'Kolkata', 'Jagdeep Dhankhar', 'Mamata Banerjee', 77.08, 'Bengali', 20000, 1950, 'East', 'Tropical', 'Cultural Festivals', 'Sundarbans, Darjeeling, Victoria Memorial'),
(9, 'Bihar', 104099452, 94163, 'Patna', 'Phagu Chauhan', 'Nitish Kumar', 61.80, 'Hindi', 16000, 1950, 'East', 'Subtropical', 'Historical Sites', 'Bodh Gaya, Nalanda, Rajgir'),
(10, 'Odisha', 41974218, 155707, 'Bhubaneswar', 'Ganeshi Lal', 'Naveen Patnaik', 72.87, 'Odia', 18000, 1950, 'East', 'Tropical', 'Temples', 'Konark Sun Temple, Puri, Chilika Lake'),
(11, 'Punjab', 27743338, 50362, 'Chandigarh', 'Banwarilal Purohit', 'Charanjit Singh Channi', 75.84, 'Punjabi', 23000, 1950, 'North', 'Temperate', 'Agriculture', 'Golden Temple, Amritsar, Jallianwala Bagh'),
(12, 'Haryana', 25351462, 44212, 'Chandigarh', 'Bandaru Dattatreya', 'Manohar Lal Khattar', 75.55, 'Hindi', 24000, 1966, 'North', 'Tropical', 'Agriculture', 'Kurukshetra, Gurgaon, Panipat'),
(13, 'Madhya Pradesh', 72626809, 308252, 'Bhopal', 'Mangubhai Patel', 'Shivraj Singh Chouhan', 70.63, 'Hindi', 19000, 1956, 'Central', 'Tropical', 'Wildlife Sanctuaries', 'Kanha National Park, Sanchi Stupa, Khajuraho'),
(14, 'Assam', 31205576, 78438, 'Dispur', 'Jagdish Mukhi', 'Himanta Biswa Sarma', 72.19, 'Assamese', 17000, 1950, 'North-East', 'Tropical', 'Tea Gardens', 'Kaziranga National Park, Majuli, Kamakhya Temple'),
(15, 'Chhattisgarh', 25545198, 135191, 'Raipur', 'Anusuiya Uikey', 'Bhupesh Baghel', 70.28, 'Hindi', 17000, 2000, 'Central', 'Tropical', 'Mineral Resources', 'Chitrakoot Falls, Bastar, Bilaspur'),
(16, 'Jharkhand', 32988134, 79716, 'Ranchi', 'Ramesh Bais', 'Hemant Soren', 66.41, 'Hindi', 16000, 2000, 'East', 'Tropical', 'Mineral Resources', 'Dassam Falls, Deoghar, Jamshedpur'),
(17, 'Himachal Pradesh', 6864602, 55673, 'Shimla', 'Rajendra Arlekar', 'Jai Ram Thakur', 83.78, 'Hindi', 20000, 1971, 'North', 'Temperate', 'Hill Stations', 'Manali, Shimla, Dalhousie'),
(18, 'Uttarakhand', 10086292, 53483, 'Dehradun', 'Lt. Gen Gurmit Singh', 'Pushkar Singh Dhami', 79.63, 'Hindi', 21000, 2000, 'North', 'Temperate', 'Pilgrimage Sites', 'Rishikesh, Haridwar, Nainital'),
(19, 'Telangana', 35286757, 112077, 'Hyderabad', 'Tamilisai Soundararajan', 'K. Chandrashekar Rao', 66.54, 'Telugu', 22000, 2014, 'South', 'Tropical', 'Hyderabad Cuisine', 'Charminar, Golconda Fort, Ramoji Film City'),
(20, 'Andhra Pradesh', 49577103, 162968, 'Amaravati', 'Biswa Bhusan Harichandan', 'Y. S. Jagan Mohan Reddy', 67.41, 'Telugu', 18000, 2014, 'South', 'Tropical', 'Beaches', 'Visakhapatnam, Tirupati, Araku Valley');

UPDATE state_info SET total_population = 62000000 WHERE state_id = 1;
UPDATE state_info SET total_area = 191800 WHERE state_id = 1;
UPDATE state_info SET literacy_rate = 76.00 WHERE state_id = 1;
UPDATE state_info SET famous_for = 'IT Hub' WHERE state_id = 1;
UPDATE state_info SET tourist_attractions = 'Lalbagh, Cubbon Park' WHERE state_id = 1;

UPDATE state_info SET total_population = 73100000 WHERE state_id = 2;
UPDATE state_info SET total_area = 130100 WHERE state_id = 2;
UPDATE state_info SET literacy_rate = 81.00 WHERE state_id = 2;
UPDATE state_info SET famous_for = 'Temples' WHERE state_id = 2;
UPDATE state_info SET tourist_attractions = 'Marina Beach, Meenakshi Temple' WHERE state_id = 2;

DELETE FROM state_info WHERE state_id = 3;
DELETE FROM state_info WHERE state_id = 4;
DELETE FROM state_info WHERE state_id = 5;


SELECT * FROM state_info WHERE region = 'South' AND literacy_rate > 75;


SELECT * FROM state_info WHERE total_population > 60000000 OR gdp_per_capita > 25000;


SELECT * FROM state_info WHERE state_name IN ('Karnataka', 'Tamil Nadu');


SELECT * FROM state_info WHERE state_name NOT IN ('Karnataka', 'Tamil Nadu');



